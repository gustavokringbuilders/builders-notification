package br.com.builders.notification.core.modules.notification.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Value
@Builder
@Document(collection = "Notification")
public class NotificationModel {

    @Id
    String id;
    String details;
    LocalDateTime createdAt;
}
