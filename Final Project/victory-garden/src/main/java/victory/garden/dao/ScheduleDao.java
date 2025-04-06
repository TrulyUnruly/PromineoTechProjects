package victory.garden.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import victory.garden.entity.Schedule;

public interface ScheduleDao extends JpaRepository<Schedule, Long> {
	
	//Set<Schedule> findAllByScheduleIn(Set<String> schedules);

}
