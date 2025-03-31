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
public class Climate {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long climate_id;

	 @EqualsAndHashCode.Exclude
		@Column(name = "climate_type") 
	 private String climateType;
	
}