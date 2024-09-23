package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.EventDomainModel;
import com.brightly.event_space.domain.EventDomainService;
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
public class EventResource {

    @Inject
    EventDomainService eventDomainService;

    @POST
    @Path("/event")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEvent(EventDomainModel request) {
        EventDomainModel eventDomainModel =
                eventDomainService.createEvent(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("eventId", eventDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }

    @GET
    @Path("/events")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<EventDomainModel> getEventsByTenant(@QueryParam("tenantId") String tenantId) {
        return eventDomainService.getEventList(tenantId);
    }

    @GET
    @Path("/event/{eventId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EventDomainModel getEventById(@PathParam("eventId") UUID eventId) {
        return eventDomainService.getEventById(eventId);
    }

    @PUT
    @Path("/event")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EventDomainModel updateEvent(EventDomainModel request) {
        return eventDomainService.updateEvent(request);
    }
}
