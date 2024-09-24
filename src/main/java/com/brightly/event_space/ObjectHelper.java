package com.brightly.event_space;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class ObjectHelper {

    private static final ObjectMapper mapper;

    static {
        mapper = JsonMapper.builder().addModule(new JavaTimeModule()).build();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private ObjectHelper() {
    }

    public static <T> String toJsonString(T t) {
        try {
            return mapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            log.error("error in conversion", e);
            return "";
        }
    }

    public static <T> T toObject(String jsonBody, Class<T> targetClass) {
        try {
            return mapper.readValue(jsonBody, targetClass);
        } catch (JsonProcessingException e) {
            log.error("error in conversion", e);
            return null;
        }
    }

    public static <P, T> T mapToOtherObject(P sourceObject, Class<T> targetClass) {
        try {
            return mapper.convertValue(sourceObject, targetClass);
        } catch (IllegalArgumentException ex) {
            log.error("error while conversion", ex);
            return null;
        }
    }
}
