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

import victory.garden.controller.model.ClimateData;
import victory.garden.controller.model.PlantData;
import victory.garden.dao.ClimateDao;
import victory.garden.dao.PlantDao;
import victory.garden.dao.ScheduleDao;
import victory.garden.entity.Climate;
import victory.garden.entity.Plant;

@Service
public class GardenService {

	@Autowired
	private PlantDao plantDao;
	
	@Autowired
	private ScheduleDao scheduleDao;
	
	@Autowired
	private ClimateDao climateDao;
//Elise
//	@Transactional(readOnly = false)
//	public PlantData savePlant(PlantData plantData) {
//		Long plantId = plantData.getPlantId();
//		Plant plant = findOrCreatePlant(plantId, plantData.getPlantName());
//
//		setFieldsInPlant(plant, plantData);
//		return new PlantData(plantDao.save(plant));
//	}

	// public PlantData getPlant() {
	// Long plantId =new Long(1);
	// Plant plant = (plantDao.getById(plantId));

	// return new PlantData(plantDao.getById(plantId));

	// }

	private void setFieldsInPlant(Plant plant, PlantData plantData) {
		plant.setPlant_name(plantData.getPlantName());
		plant.setPlant_type(plantData.getPlantType());

	}
//Elise
//	private Plant findOrCreatePlant(Long plantId, String plantName) {
//		Plant plant;
//
//		if (Objects.isNull(plantId)) {
//			Optional<Plant> opPlant = plantDao.findByPlantName(plantName);
//			
//		if(opPlant.isPresent()) {
//			throw new DuplicateKeyException("Plant with Name " + plantName + " already exists");
//		}
//		
//			plant = new Plant();
//		} else {
//			plant = findPlantById(plantId);
//		}
//		return plant;
//	}

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

	@Transactional(readOnly = true)
	public PlantData retrievePlantById(Long plantId) {
		Plant plant = findPlantById(plantId);
		return new PlantData(plant);
	}
	
	@Transactional(readOnly = false)
	public void deletePlantById(Long plantId) {
		Plant plant = findPlantById(plantId);
		plantDao.delete(plant);
	}

	@Transactional(readOnly = true)
	public ClimateData retrieveClimateById(Long climateId) {
		Climate climate = findClimateById(climateId);
		return new ClimateData(climate);
	}

	private Climate findClimateById(Long climateId) {
		return climateDao.findById(climateId)
				.orElseThrow(() -> new NoSuchElementException("Climate with ID =" + climateId + " was not found."));
	}

	@Transactional(readOnly = false)
	public ClimateData saveClimate(ClimateData climateData) {
			//Long climateId = climateData.getClimateId();
			Climate climate = findOrCreateClimate(climateData.getClimateType());
			setFieldsInClimate(climate, climateData);
			return new ClimateData(climateDao.save(climate));
		}
	private void setFieldsInClimate(Climate climate, ClimateData climateData) {
		climate.setClimateType(climateData.getClimateType());
	}

	private Climate findOrCreateClimate(String climateType) {
		Climate climate;
		
//		if (Objects.isNull(climateId)) {
					Optional<Climate> opClimate = climateDao.findByClimateType(climateType);
					
				if(opClimate.isPresent()) {
					throw new DuplicateKeyException("Climate Type " + climateType + " already exists");
				}
					climate = new Climate();
//		} else {
//			plant = findPlantById(plantId);
//				}
		
				return climate;

	}

	//@Transactional(readOnly = false)
	//public BedData saveBed(Long plantId, BedData bedData) {
	//	Plant plant = findPlantById(plantId);
		
	//	Set<Schedule> schedules = scheduleDao.findAllByScheduleIn(bedData.getSchedules());
		
	}


