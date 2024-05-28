package br.com.builders.notification.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.time.LocalDateTime;

@Value
@With
@JsonDeserialize(builder = NotificationDTO.Builder.class)
@Builder(builderClassName = "Builder")
public class NotificationDTO {

    String id;
    String details;
    LocalDateTime createdAt;

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {}

}
