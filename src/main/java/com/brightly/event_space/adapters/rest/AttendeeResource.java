package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.AttendeeDomainModel;
import com.brightly.event_space.domain.AttendeeDomainService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Transactional
@Path("/v1")
public class AttendeeResource {

    @Inject
    AttendeeDomainService attendeeDomainService;

    @POST
    @Path("/attendee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAttendee(AttendeeDomainModel request) {
        AttendeeDomainModel attendeeDomainModel =
                attendeeDomainService.createAttendee(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("AttendeeId", attendeeDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }

    @GET
    @Path("/attendees/{eventId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<AttendeeDomainModel> getAttendeesByEventId(@PathParam("eventId") UUID eventId) {
        return attendeeDomainService.getAttendeeByEventId(eventId);
    }
}
