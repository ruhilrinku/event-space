package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SpeakerDomainModel;
import com.brightly.event_space.domain.port.SpeakerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Inject
    SpeakerDatabaseRepository speakerDatabaseRepository;

    @Override
    public SpeakerDomainModel createSpeaker(SpeakerDomainModel speakerDomainModel) {
        Speaker speaker = SpeakerDataModelConverter.toSpeakerDataModel(speakerDomainModel);

        speakerDatabaseRepository.persistAndFlush(speaker);

        return SpeakerDataModelConverter.toSpeakerDomainModel(speaker);
    }

    @Override
    public List<SpeakerDomainModel> getSpeakersByEventId(UUID eventId) {
        return speakerDatabaseRepository.list("eventId = ?1", eventId)
                .stream()
                .map(SpeakerDataModelConverter::toSpeakerDomainModel)
                .toList();
    }
}