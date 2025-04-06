package victory.garden.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
public class Bed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bedId;

	@EqualsAndHashCode.Exclude
	private String bedType;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "plant_bed", joinColumns = @JoinColumn(name = "plant_id"), inverseJoinColumns = @JoinColumn(name = "bed_id"))
	private Set<Plant> plants = new HashSet<>();

	
}
