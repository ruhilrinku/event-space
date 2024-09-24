package com.brightly.event_space.adapters.database;

import com.brightly.event_space.domain.SpeakerDomainModel;

import java.time.OffsetDateTime;

public final class SpeakerDataModelConverter {

    private SpeakerDataModelConverter() {}

    public static Speaker toSpeakerDataModel(SpeakerDomainModel speakerDomainModel) {
        if (speakerDomainModel == null) {
            return null;
        }

        Speaker.SpeakerBuilder speakerBuilder = Speaker.builder();

        return speakerBuilder
                .name(speakerDomainModel.getName())
                .email(speakerDomainModel.getEmail())
                .description(speakerDomainModel.getDescription())
                .eventId(speakerDomainModel.getEventId())
                .tenantId(speakerDomainModel.getTenantId())
                .avatar(speakerDomainModel.getAvatar())
                .link(speakerDomainModel.getLink())
                .createDate(OffsetDateTime.now())
                .build();
    }

    public static SpeakerDomainModel toSpeakerDomainModel(Speaker speakerDataModel) {
        if (speakerDataModel == null) {
            return null;
        }

        return SpeakerDomainModel.builder()
                .id(speakerDataModel.getId())
                .name(speakerDataModel.getName())
                .description(speakerDataModel.getDescription())
                .eventId(speakerDataModel.getEventId())
                .link(speakerDataModel.getLink())
                .avatar(speakerDataModel.getAvatar())
                .email(speakerDataModel.getEmail())
                .tenantId(speakerDataModel.getTenantId())
                .build();
    }
}
