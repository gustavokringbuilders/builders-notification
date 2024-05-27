package br.com.builders.notification.core.modules.notification.service;

import br.com.builders.notification.core.modules.notification.exception.NotificationException;
import br.com.builders.notification.core.modules.notification.model.NotificationModel;
import br.com.builders.notification.core.modules.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;


    @Override
    public NotificationModel findById(String id) {
        return notificationRepository.findById(id)
                .orElseThrow(NotificationException::new);
    }

    @Override
    public List<NotificationModel> findByDateInterval(LocalDateTime from, LocalDateTime to) {
        return List.of();
    }
}
