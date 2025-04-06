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
		this.climateId = climate.getClimateId();
		this.climateType = climate.getClimateType();
	}
	
	public Climate toClimate() {
		Climate climate = new Climate();
		climate.setClimateId(climateId);
		climate.setClimateType(climateType);
		
		return climate;
	}
	
}
