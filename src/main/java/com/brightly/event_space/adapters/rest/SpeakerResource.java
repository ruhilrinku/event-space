package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.SpeakerDomainModel;
import com.brightly.event_space.domain.SpeakerDomainService;
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
public class SpeakerResource {

    @Inject
    SpeakerDomainService speakerDomainService;

    @POST
    @Path("/speaker")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSpeaker(SpeakerDomainModel request) {
        SpeakerDomainModel speakerDomainModel =
                speakerDomainService.createSpeaker(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("SpeakerId", speakerDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }

    @GET
    @Path("/speakers/{eventId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SpeakerDomainModel> getSpeakersByEventId(@PathParam("eventId") UUID eventId) {
        return speakerDomainService.getSpeakersByEventId(eventId);
    }
}
