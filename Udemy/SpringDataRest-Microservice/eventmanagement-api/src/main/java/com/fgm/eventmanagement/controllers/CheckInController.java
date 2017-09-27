package com.fgm.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fgm.eventmanagement.controllers.exceptions.AlreadyCheckInException;
import com.fgm.eventmanagement.controllers.exceptions.NotCheckInException;
import com.fgm.eventmanagement.entities.Participant;
import com.fgm.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

	@Autowired
	ParticipantRepository participantRepository;

	@PostMapping("/checkin/{id}")
	ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id,
			PersistentEntityResourceAssembler assembler) {

		Participant participant = participantRepository.findOne(id);

		if (participant != null) {
			if (participant.getCheckedIn()) {
				throw new AlreadyCheckInException();
			}
		} else {
			throw new ResourceNotFoundException();
		}

		participant.setCheckedIn(true);
		participantRepository.save(participant);

		return ResponseEntity.ok(assembler.toResource(participant));
	}

	@PostMapping("/checkout/{id}")
	ResponseEntity<PersistentEntityResource> checkOut(@PathVariable Long id,
			PersistentEntityResourceAssembler assembler) {

		Participant participant = participantRepository.findOne(id);

		if (participant != null) {
			if (!participant.getCheckedIn()) {
				throw new NotCheckInException();
			}
		} else {
			throw new ResourceNotFoundException();
		}
		
		participant.setCheckedIn(false);
		participantRepository.save(participant);
		
		return ResponseEntity.ok(assembler.toResource(participant));
	}

}
