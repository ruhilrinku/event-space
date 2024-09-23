package com.brightly.event_space.domain;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.google.firebase.messaging.TopicManagementResponse;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class FirebaseService {
    private final FirebaseMessaging fcm;

    public FirebaseService(FirebaseMessaging fcm) {
        this.fcm = fcm;
    }

    public String subscribeToTopic(String topic, String registrationToken) {
        TopicManagementResponse response = null;
        try {
            response = fcm.subscribeToTopic(List.of(registrationToken), topic);
        } catch (FirebaseMessagingException e) {
            log.error("Oops! ", e);
            return e.getMessage();
        }
        log.info("Subscription status any error: {}", response.getErrors());
        return response.getSuccessCount()+"";
    }

    public String postToTopic(String topic, String message) {
//        Notification notification = Notification.builder()
//                .setTitle("Test Title")
//                .setBody(message)
//                .build();
        Message msg = Message.builder()
                .setTopic(topic)
                .putData("Message", message)
                .build();
        try {
            return fcm.send(msg);
        } catch (FirebaseMessagingException e) {
            log.error("Oops! ", e);
            return e.getMessage();
        }
    }
}
