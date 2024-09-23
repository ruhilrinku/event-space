package com.brightly.event_space.adapters.rest;

import com.brightly.event_space.domain.FirebaseService;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import lombok.extern.slf4j.Slf4j;

@Path("/v1")
@Slf4j
public class FirebaseResource {

    private final FirebaseService firebaseService;

    public FirebaseResource(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }


    @POST
    @Path("/subscribe/{topic}/{registrationToken}")
    public String subscribeToTopic(@PathParam("topic") String topic, @PathParam("registrationToken") String registrationToken) {
        log.info("subscribeToTopic: {}", topic);
        return firebaseService.subscribeToTopic(topic, registrationToken);
    }

    @POST
    @Path("/topics/{topic}")
    public String postToTopic(String message, @PathParam("topic") String topic) {
        log.info("postToTopic: {}", topic);
        return firebaseService.postToTopic(topic, message);
    }
}