package victory.garden.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Bed;
import victory.garden.entity.Plant;

@Data
@NoArgsConstructor
public class BedData {
	private Long bedId;
	private String bedType;
//	private Set<PlantBed> plants = new HashSet<>();

	public BedData(Bed bed) {
		this.bedId = bed.getBedId();
		this.bedType = bed.getBedType();
//		plant = new PlantBed(bed.getPlant());
		
//		for (Plant plant : bed.getPlants()) {
//			plants.add(new PlantBed(plant));
//		}
		
}
		
@Data		
@NoArgsConstructor
public static class PlantBed {
	private Long plantId;
	private String plantName;
	private String plantType;	
	
	public PlantBed(Plant plant) {
		plantId= plant.getPlantId();
		plantName = plant.getPlantName();
		plantType = plant.getPlantType();
		
	}
	}


	}

