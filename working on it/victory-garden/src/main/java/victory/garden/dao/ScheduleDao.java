package victory.garden.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Schedule;

public interface ScheduleDao extends JpaRepository<Schedule, Long> {
	
	//Set<Schedule> findAllByScheduleIn(Set<String> schedules);

}
