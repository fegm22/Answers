package com.fgm.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fgm.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
