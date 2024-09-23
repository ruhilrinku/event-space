package com.brightly.event_space.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.Produces;
import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
@Slf4j
public class Configuration {
    @ConfigProperty(name = "gcp.firebase.service-account")
    String filePath;

    void onStart(@Observes StartupEvent ev) {
        log.info("The application is starting...");
    }

    @Produces
    @ApplicationScoped
    FirebaseMessaging firebaseMessaging() throws IOException {
        return FirebaseMessaging.getInstance(firebaseApp());
    }

    @Produces
    @ApplicationScoped
    FirebaseApp firebaseApp() throws IOException {
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(googleCredentials())
                .build();

        return FirebaseApp.initializeApp(options);
    }

    @Produces
    @ApplicationScoped
    GoogleCredentials googleCredentials() throws IOException {
        log.info("file path: {}", filePath);
        try (InputStream is = getClass().getResourceAsStream("/" + filePath)) {
            log.info("file size: {}", is.available());
            return GoogleCredentials.fromStream(is);
        } catch (Exception ex) {
            log.error("error while creating bean: ",ex);
            return GoogleCredentials.getApplicationDefault();
        }
    }
}
