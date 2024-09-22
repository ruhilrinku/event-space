package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.EventDomainModel;
import com.brightly.event_space.domain.EventDomainService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Path("/v1/event")
public class EventResource {

    @Inject
    EventDomainService eventDomainService;

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEvent(EventDomainModel request) {
        EventDomainModel eventDomainModel =
                eventDomainService.createEvent(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("eventId", eventDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }
}
