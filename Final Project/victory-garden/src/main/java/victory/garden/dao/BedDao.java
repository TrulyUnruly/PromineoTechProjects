package victory.garden.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Bed;



	public interface BedDao extends JpaRepository<Bed, Long> {

		Optional<Bed> findByBedType(String bedType);
	}
