package br.com.builders.notification.core.modules.notification.repository;

import br.com.builders.notification.core.modules.notification.model.NotificationModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NotificationRepository extends ReactiveMongoRepository<NotificationModel, String> {

}
