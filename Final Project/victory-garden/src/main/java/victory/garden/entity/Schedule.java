package victory.garden.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleId;

	@EqualsAndHashCode.Exclude
	@Column(name = "sow_date")
	private String sowDate;
	
	@EqualsAndHashCode.Exclude
	@Column(name = "transplant_date")
	private String transplantDate;
	
	@EqualsAndHashCode.Exclude
	@Column(name = "harvest_date")
	private String harvestDate;
	
}