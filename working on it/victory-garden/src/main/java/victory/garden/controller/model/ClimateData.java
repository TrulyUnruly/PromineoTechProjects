package victory.garden.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Climate;

@Data
@NoArgsConstructor
public class ClimateData {
	private Long climateId;
    private String climateType;
	public ClimateData(Climate climate) {
		climateId = climate.getClimateId();
		climateType = climate.getClimateType();
		
	}
}
