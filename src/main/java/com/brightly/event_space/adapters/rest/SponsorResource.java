package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.SponsorDomainModel;
import com.brightly.event_space.domain.SponsorDomainService;
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
public class SponsorResource {

    @Inject
    SponsorDomainService sponsorDomainService;

    @POST
    @Path("/sponsor")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSponsor(SponsorDomainModel request) {
        SponsorDomainModel sponsorDomainModel =
                sponsorDomainService.createSponsor(request);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("SponsorId", sponsorDomainModel.getId().toString());

        return Response.ok().entity(responseMap).build();
    }

    @GET
    @Path("/sponsors/{eventId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SponsorDomainModel> getSponsorsByEventId(@PathParam("eventId") UUID eventId) {
        return sponsorDomainService.getSponsorsByEventId(eventId);
    }
}
