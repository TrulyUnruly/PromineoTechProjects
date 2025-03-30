package victory.garden.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Bed;

@Data
@NoArgsConstructor
public class BedData {
	private Long bedId;
	private String bedType;
	
	BedData(Bed bed) {
		bedId = bed.getBedId();
		bedType = bed.getBedType();
	}
}
