package victory.garden.controller.model;

import lombok.Data;

@Data
public class ScheduleData {
	private Long scheduleId;
	private String sowDate;
	private String transplantDate;
	private String harvestDate;
}
