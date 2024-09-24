package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.TicketDomainModel;
import com.brightly.event_space.domain.TicketDomainService;
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
public class TicketResource {

    @Inject
    TicketDomainService ticketDomainService;

    @POST
    @Path("/ticket")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTicket(TicketDomainModel request) {
        TicketDomainModel ticketDomainModel =
                ticketDomainService.createTicket(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("ticketId", ticketDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }

    @GET
    @Path("/tickets/{eventId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<TicketDomainModel> getTicketsByEventId(@PathParam("eventId") UUID eventId) {
        return ticketDomainService.getTicketsByEventId(eventId);
    }
}
