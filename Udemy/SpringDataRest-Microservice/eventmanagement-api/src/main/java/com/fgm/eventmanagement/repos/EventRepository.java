package com.fgm.eventmanagement.repos;

import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.fgm.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {	
	
	Page<Event>findByName(@Param("name") String name, Pageable pageable);
	
	Page<Event>findByNameAndZoneId(@Param("name") String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);

	@Override
	Page<Event> findAll(Pageable pageable);
}
