package br.com.builders.notification.core.modules.notification;

import br.com.builders.notification.core.modules.notification.repository.NotificationRepository;
import br.com.builders.notification.core.modules.notification.service.NotificationService;
import br.com.builders.notification.core.modules.notification.service.NotificationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.support.ReactiveMongoRepositoryFactory;

public class NotificationModuleConfig {

    @Bean
    NotificationRepository notificationRepository(final ReactiveMongoTemplate reactiveMongoTemplate) {
        var mongoRepositoryFactory = new ReactiveMongoRepositoryFactory(reactiveMongoTemplate);
        return mongoRepositoryFactory.getRepository(NotificationRepository.class);
    }

    @Bean("businessNotificationService")
    NotificationService notificationService(final NotificationRepository notificationRepository) {
        return new NotificationServiceImpl(notificationRepository);
    }

}
