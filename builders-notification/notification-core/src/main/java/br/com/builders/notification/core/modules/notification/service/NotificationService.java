package br.com.builders.notification.core.modules.notification.service;

import br.com.builders.notification.core.modules.notification.model.NotificationModel;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationService {


    NotificationModel findById(String id);

    List<NotificationModel> findByDateInterval(LocalDateTime from, LocalDateTime to);


}
