package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.SessionDomainModel;
import com.brightly.event_space.domain.SessionDomainService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Path("/v1")
@RequiredArgsConstructor
public class SessionResource {

    private final SessionDomainService sessionDomainService;

    @POST
    @Path("/session")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEvent(SessionDomainModel request) {
        String id = sessionDomainService.createSession(request);
        return Response.ok().entity(Map.of("sessionId", id)).build();
    }

    @GET
    @Path("/sessions/{eventId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SessionDomainModel> getSessionList(@PathParam("eventId") UUID eventId) {
        return sessionDomainService.getSessions(eventId);
    }
}
