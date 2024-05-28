package br.com.builders.notification.core.modules.notification.service;

import br.com.builders.notification.core.modules.notification.model.NotificationModel;
import br.com.builders.notification.core.modules.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Override
    public Mono<NotificationModel> findById(String id) {
        return notificationRepository.findById(id);
    }

    @Override
    public Flux<NotificationModel> findByDateInterval(LocalDateTime from, LocalDateTime to) {
        return notificationRepository.findAll();
    }

    @Override
    public Mono<NotificationModel> insert(NotificationModel notificationModel) {
        return notificationRepository.insert(notificationModel);
    }
}
