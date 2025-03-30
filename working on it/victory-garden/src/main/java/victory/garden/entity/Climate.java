package victory.garden.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Climate {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long climateId;

	    private String climateType;
	
}