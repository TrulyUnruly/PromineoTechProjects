package victory.garden.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Plant;

public interface PlantDao extends JpaRepository<Plant, Long> {

	Optional<Plant> findByPlantName(String plantName);



	

}
