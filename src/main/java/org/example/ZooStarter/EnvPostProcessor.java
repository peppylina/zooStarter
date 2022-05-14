package org.example.ZooStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

// Этот класс вызывается даже до инициализации контекста.
// Здесь можно настраивать Environment
public class EnvPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length != 0) return;
        environment.setActiveProfiles(getSeason());
    }

    private String getSeason() {
        return "WINTER";
    }
}
