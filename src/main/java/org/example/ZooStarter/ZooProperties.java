package org.example.ZooStarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ConditionContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@ConfigurationProperties(value = "zoo")
public class ZooProperties {

    @Data
    public static class Animals {
        List<String> asleepInWinter;
    }

    Boolean open;

    ZooProperties.Animals animals;

    List<String> workingDays;

    public static List<String> getWorkingDaysFromConditionContext(ConditionContext context) {
        String workingDaysProp = context.getEnvironment().getProperty("zoo.working-days");

        return (workingDaysProp == null || workingDaysProp.equals("")) ?
                new ArrayList<>() :
                Arrays.stream(workingDaysProp.split(",")).map(String::trim).collect(Collectors.toList());

    }

}
