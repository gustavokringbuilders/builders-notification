package br.com.builders.notification.core.modules.notification.service;

import br.com.builders.notification.core.modules.notification.model.NotificationModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public interface NotificationService {


    Mono<NotificationModel> findById(String id);

    Flux<NotificationModel> findByDateInterval(LocalDateTime from, LocalDateTime to);

    Mono<NotificationModel> insert(NotificationModel notificationModel);


}
