package victory.garden.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Climate;

public interface ClimateDao extends JpaRepository<Climate, Long> {

	Optional<Climate> findByClimateType(String climateType);

	
	

}
