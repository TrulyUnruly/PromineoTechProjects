package victory.garden.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import victory.garden.entity.Schedule;

@Data
@NoArgsConstructor
public class ScheduleData {
	private Long scheduleId;
	private String sowDate;
	private String transplantDate;
	private String harvestDate;

	public ScheduleData(Schedule schedule) {
		this.scheduleId = schedule.getScheduleId();
		this.sowDate = schedule.getSowDate();
		this.transplantDate = schedule.getTransplantDate();
		this.harvestDate = schedule.getHarvestDate();
	}

	public Schedule toSchedule() {
		Schedule schedule = new Schedule();
		schedule.setScheduleId(scheduleId);
		schedule.setSowDate(sowDate);
		schedule.setHarvestDate(harvestDate);
		schedule.setTransplantDate(transplantDate);
		return schedule;
	}
}
