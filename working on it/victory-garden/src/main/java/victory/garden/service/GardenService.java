package victory.garden.service;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victory.garden.controller.model.PlantData;
import victory.garden.dao.PlantDao;
import victory.garden.entity.Plant;

@Service
public class GardenService {

	@Autowired
	private PlantDao plantDao;

	@Transactional(readOnly = false)
	public PlantData savePlant(PlantData plantData) {
		Long plantId = plantData.getPlantId();
		Plant plant = findOrCreatePlant(plantId, plantData.getPlantName());

		setFieldsInPlant(plant, plantData);
		return new PlantData(plantDao.save(plant));
	}

	// public PlantData getPlant() {
	// Long plantId =new Long(1);
	// Plant plant = (plantDao.getById(plantId));

	// return new PlantData(plantDao.getById(plantId));

	// }

	private void setFieldsInPlant(Plant plant, PlantData plantData) {
		plant.setPlantName(plantData.getPlantName());
		plant.setPlantType(plantData.getPlantType());

	}

	private Plant findOrCreatePlant(Long plantId, String plantName) {
		Plant plant;

		if (Objects.isNull(plantId)) {
			Optional<Plant> opPlant = plantDao.findByPlantName(plantName);
			
		if(opPlant.isPresent()) {
			throw new DuplicateKeyException("Plant with Name " + plantName + " already exists");
		}
		
			plant = new Plant();
		} else {
			plant = findPlantById(plantId);
		}
		return plant;
	}

	private Plant findPlantById(Long plantId) {
		return plantDao.findById(plantId)
				.orElseThrow(() -> new NoSuchElementException("Plant with ID =" + plantId + " was not found."));
	}

	@Transactional(readOnly = true)
	public List<PlantData> retrieveAllPlants() {
		List<Plant> plants = plantDao.findAll();
		List<PlantData> response = new LinkedList<>();

		for (Plant plant : plants) {
			response.add(new PlantData(plant));
		}
		return response;
	}

	public PlantData retrievePlantById(Long plantId) {
		Plant plant = findPlantById(plantId);
		return new PlantData(plant);
	}

}
