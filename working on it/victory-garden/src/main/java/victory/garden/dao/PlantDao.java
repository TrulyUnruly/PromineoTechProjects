package victory.garden.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Plant;

public interface PlantDao extends JpaRepository<Plant, Long> {

	//Optional<Plant> findByPlant_Name(String plantName);

}
