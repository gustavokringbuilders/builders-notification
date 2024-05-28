package br.com.builders.notification.api.config;

import br.com.builders.notification.core.modules.notification.NotificationModuleConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({NotificationModuleConfig.class})
public class ApplicationConfig {
}
