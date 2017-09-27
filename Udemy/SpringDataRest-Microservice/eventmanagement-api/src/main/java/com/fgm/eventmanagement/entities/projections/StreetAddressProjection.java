package com.fgm.eventmanagement.entities.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.fgm.eventmanagement.entities.Venue;

@Projection(name="virtual", types= {Venue.class})
public interface StreetAddressProjection {
	
	@Value("#{target.streetAddress} #{target.streetAddress2}")
	String getCompletedStreetAddress();
}
