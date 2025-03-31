package victory.garden.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Bed;

@Data
@NoArgsConstructor
public class BedData {
	private Long bedId;
	private String bedType;
	
	public BedData(Bed bed) {
		bedId = bed.getBed_id();
		bedType = bed.getBed_type();
	}

	
}
