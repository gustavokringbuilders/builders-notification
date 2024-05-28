package br.com.builders.notification.api.mapper;

import br.com.builders.notification.api.dto.NotificationDTO;
import br.com.builders.notification.core.modules.notification.model.NotificationModel;


public class NotificationMapper {

    public static NotificationDTO parseTo(final NotificationModel notificationModel) {
        return NotificationDTO.builder()
                .details(notificationModel.getDetails())
                .build();
    }


}
