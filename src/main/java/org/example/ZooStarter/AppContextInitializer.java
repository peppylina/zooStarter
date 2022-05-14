package org.example.ZooStarter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

// этот класс отрабатывает когда инициализируется контекст. В этот момент в контексте
// нет бинов, есть только Environment - состоит из properties и profiles.
public class AppContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        if (context.getEnvironment().getActiveProfiles().length == 0)
            throw new RuntimeException("Can't work without profile of season");
    }
}
