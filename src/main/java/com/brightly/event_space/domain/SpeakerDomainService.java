package com.brightly.event_space.domain;

import com.brightly.event_space.domain.port.SpeakerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class SpeakerDomainService {

    private static final Logger logger = LoggerFactory.getLogger(SpeakerDomainService.class);

    @Inject
    SpeakerRepository speakerRepository;

    public SpeakerDomainModel createSpeaker(SpeakerDomainModel speakerDomainModel) {
        SpeakerDomainModel responseSpeaker = null;
        try {
            responseSpeaker = speakerRepository.createSpeaker(speakerDomainModel);
        } catch (Exception e) {
            logger.error("failure during create Speaker, ", e);
        }
        return responseSpeaker;
    }

    public List<SpeakerDomainModel> getSpeakersByEventId(UUID eventId) {
        return speakerRepository.getSpeakersByEventId(eventId);
    }
}
