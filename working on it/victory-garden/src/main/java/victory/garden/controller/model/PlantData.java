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
	private ScheduleData scheduleId;
	private Set<BedResponse> beds = new HashSet<>();

	public PlantData(Plant plant) {
		plantId = plant.getPlant_id();
		plantName = plant.getPlant_name();
		plantType = plant.getPlant_type();
		climate = new ClimateData(plant.getClimate_id());
		for (Bed bed : plant.getBeds()) {
			beds.add(new BedResponse(bed));
		}
	}

	@Data
	@NoArgsConstructor
	static class BedResponse {
		private Long bedId;
		private String bedType;

		BedResponse(Bed bed) {
			bedId = bed.getBed_id();
			bedType = bed.getBed_type();

		}
	}
}
