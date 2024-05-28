package br.com.builders.notification.api.controller.v1;

import br.com.builders.notification.api.dto.NotificationDTO;
import br.com.builders.notification.api.mapper.NotificationMapper;
import br.com.builders.notification.core.modules.notification.model.NotificationModel;
import br.com.builders.notification.core.modules.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping(produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<NotificationDTO> findNotifications(final LocalDateTime from, final LocalDateTime to) {
        return notificationService.findByDateInterval(from, to)
                .map(NotificationMapper::parseTo);
    }

    @PostMapping
    public Mono<NotificationDTO> insertNotification(final NotificationDTO notificationDTO) {
        return notificationService.insert(
                NotificationModel.builder()
                        .details(notificationDTO.getDetails())
                        .build()
        ).map(NotificationMapper::parseTo);
    }


}
