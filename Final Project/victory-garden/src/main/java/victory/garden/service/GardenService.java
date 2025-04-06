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

import victory.garden.controller.model.BedData;
import victory.garden.controller.model.ClimateData;
import victory.garden.controller.model.PlantData;
import victory.garden.controller.model.ScheduleData;
import victory.garden.dao.BedDao;
import victory.garden.dao.ClimateDao;
import victory.garden.dao.PlantDao;
import victory.garden.dao.ScheduleDao;
import victory.garden.entity.Bed;
import victory.garden.entity.Climate;
import victory.garden.entity.Plant;
import victory.garden.entity.Schedule;

@Service
public class GardenService {

	@Autowired
	private PlantDao plantDao;
	
	@Autowired
	private ScheduleDao scheduleDao;
	
	@Autowired
	private ClimateDao climateDao;
	
	@Autowired
	private BedDao bedDao;

	@Transactional(readOnly = false)
	public PlantData savePlant(PlantData plantData) {
		Plant plant = plantData.toPlant();
		Plant dbPlant = plantDao.save(plant);
		return new PlantData(dbPlant);
	}

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
			Long climateId = climateData.getClimateId();
			Climate climate = findOrCreateClimate(climateId, climateData.getClimateType());
			setFieldsInClimate(climate, climateData);
			return new ClimateData(climateDao.save(climate));
		}
	private void setFieldsInClimate(Climate climate, ClimateData climateData) {
		climate.setClimateType(climateData.getClimateType());

	}

	private Climate findOrCreateClimate(Long climateId, String climateType) {
		Climate climate;
		
		if (Objects.isNull(climateType)) {
					Optional<Climate> opClimate = climateDao.findByClimateType(climateType);
					
				if(opClimate.isPresent()) {
					throw new DuplicateKeyException("Climate Type " + climateType + " already exists");
				}
					climate = new Climate();
		} else {
			climate = findClimateById(climateId);
				}
		
				return climate;
	}
	
	
	
	

	@Transactional(readOnly = false)
	public BedData saveBed(Long plantId, 
			BedData bedData) {
		Plant plant = findPlantById(plantId);
//		Set<Amenity> amenities = amenityDao.findAllByAmenityIn(petParkData.getAmenities());
		Bed bed = findOrCreateBed(bedData.getBedId(), bedData.getBedType());	
		setBedFields(bed, bedData);
		
		bed.getPlants().add(plant);
		plant.getBeds().add(bed);	
		
//		for Amenity amenity : amenities) {
//			amenity.getPetParks().add(petPark);
//			petPark.getAmenities().add(amenity);
//		}
		
		Bed dbBed = bedDao.save(bed);
		return new BedData(dbBed);
	}
	
	private void setBedFields(Bed bed, BedData bedData) {
		bed.setBedType(bedData.getBedType());
		bed.setBedId(bedData.getBedId());
		
	}

	private Bed findBedById(Long bedId) {
		return bedDao.findById(bedId)
				.orElseThrow(() -> new NoSuchElementException(
						"Bed with ID =" + bedId + " does not exist."));
	}

		private Bed findOrCreateBed(Long bedId, String bedType) {
			
				Bed bed;

				if (Objects.isNull(bedId)) {
					Optional<Bed> opBed = bedDao.findByBedType(bedType);
					
				if(opBed.isPresent()) {
					throw new DuplicateKeyException("Bed Type" + bedType + " already exists");
				}
				
					bed = new Bed();
				} else {
					bed = findBedById(bedId);
				}
				return bed;
			}

		
		public ScheduleDao getScheduleDao() {
			return scheduleDao;
		}

		public void setScheduleDao(ScheduleDao scheduleDao) {
			this.scheduleDao = scheduleDao;
		}
		
		
		
		public BedData retrieveBedById(Long bedId) {
			return new BedData(findBedById (bedId));
			
		}

		@Transactional(readOnly = true)
		public ScheduleData retrieveScheduleById(Long scheduleId) {
			Schedule schedule = findScheduleById(scheduleId);
			return new ScheduleData(schedule);
		}

		private Schedule findScheduleById(Long scheduleId) {
			return scheduleDao.findById(scheduleId)
					.orElseThrow(() -> new NoSuchElementException("Schedule with ID =" + scheduleId + " was not found."));
		}
	
	}


	

