package victory.garden.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Bed;
import victory.garden.entity.Plant;

@Data
@NoArgsConstructor
public class PlantData {
	private Long plantId;
	private String plantName;
	private String plantType;
	private ClimateData climate;
	private ScheduleData schedule;
	private Set<BedResponse> beds = new HashSet<>();
	
	

	public PlantData(Plant plant) {
		this.plantId = plant.getPlantId();
		this.plantName = plant.getPlantName();
		this.plantType = plant.getPlantType();
		this.climate = new ClimateData(plant.getClimate());
		this.schedule = new ScheduleData(plant.getSchedule());
		for (Bed bed : plant.getBeds()) {
			this.beds.add(new BedResponse(bed));
		}
	}
	
	public Plant toPlant() {
		Plant plant = new Plant();
		plant.setPlantId(plantId);
		plant.setPlantName(plantName);
		plant.setPlantType(plantType);
		plant.setSchedule(schedule.toSchedule());
		plant.setClimate(climate.toClimate());
		
		
//		for (BedData bedData : bed) {
//			plant.getBeds().add(bedData.toBed());
//		}

		return plant;
	}

//	public Location toLocation() {
//		Location location = new Location();
//		location.setLocationId(locationId);
//		location.setBusinessName(businessName);
//		location.setStreetAddress(streetAddress);
//		location.setCity(city);
//		location.setState(state);
//		location.setZip(zip);
//		location.setPhone(phone);
//
//		for (DogData dogData : dogs) {
//			location.getDogs().add(dogData.toDog());
//		}
//
//		return location;
//	}
	
	
	@Data
	@NoArgsConstructor
	public static class BedResponse {
		private Long bedId;
		private String bedType;

		BedResponse(Bed bed) {
			this.bedId = bed.getBedId();
			this.bedType = bed.getBedType();

		}
	}
}
