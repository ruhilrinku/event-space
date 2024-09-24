package com.brightly.event_space.domain.port;

import com.brightly.event_space.domain.SpeakerDomainModel;

import java.util.List;
import java.util.UUID;

public interface SpeakerRepository {

    SpeakerDomainModel createSpeaker(SpeakerDomainModel speakerDomainModel);

    List<SpeakerDomainModel> getSpeakersByEventId(UUID eventId);
}
