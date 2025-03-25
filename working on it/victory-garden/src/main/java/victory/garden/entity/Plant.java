package victory.garden.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long plantId;

	@EqualsAndHashCode.Exclude
	private String plantName;

	@EqualsAndHashCode.Exclude
	private int plantType;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "plant_schedule", joinColumns = @JoinColumn(name = "plantId"), inverseJoinColumns = @JoinColumn(name = "scheduleId"))
	private Set<Schedule> schedules;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToOne
	@JoinColumn(name = "climateId", nullable = false)
	private Climate climateId;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "plant_bed", joinColumns = @JoinColumn(name = "plantId"), inverseJoinColumns = @JoinColumn(name = "bedId"))
	private Set<Bed> beds;

}
