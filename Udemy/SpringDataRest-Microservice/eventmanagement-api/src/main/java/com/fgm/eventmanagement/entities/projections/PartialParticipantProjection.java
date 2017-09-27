package com.fgm.eventmanagement.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.fgm.eventmanagement.entities.Participant;

@Projection(name="partial", types= {Participant.class})
public interface PartialParticipantProjection {
	
	String getName();
	
	Boolean getCheckedIn();

}
