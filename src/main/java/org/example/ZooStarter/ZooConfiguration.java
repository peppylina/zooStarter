package org.example.ZooStarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ZooProperties.class})
public class ZooConfiguration {

    @Bean
    @ConditionalOnWorkingDay
    @ConditionalOnWorkingDayAndOpenProperties
    public ZooListener zooListener() {
        return new ZooListener();
    }

    @Bean
    @ConditionalOnMissingBean
    public SeasonConfigurator seasonConfigurator() {
        throw new RuntimeException("No bean defined for SeasonConfiguration");
    }

}
