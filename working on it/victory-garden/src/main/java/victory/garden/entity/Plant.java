package victory.garden.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
	@Column(name = "plant_id")
	private Long plant_id;

	@EqualsAndHashCode.Exclude
	@Column(name = "plant_name")
	private String plant_name;

	@EqualsAndHashCode.Exclude
	@Column(name = "plant_type")
	private String plant_type;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToOne
	@JoinColumn(name = "schedule_id", nullable = false)
	private Schedule schedule_id;
	

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToOne
	@JoinColumn(name = "climate_id", nullable = false)
	private Climate climate_id;
	
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "plant_bed", joinColumns = @JoinColumn(name = "plant_id"), inverseJoinColumns = @JoinColumn(name = "bed_id"))
	private Set<Bed> beds;

}
