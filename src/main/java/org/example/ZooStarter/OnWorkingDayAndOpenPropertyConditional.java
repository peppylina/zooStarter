package org.example.ZooStarter;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnWorkingDayAndOpenPropertyConditional extends AllNestedConditions {
    public OnWorkingDayAndOpenPropertyConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty(value = "zoo.working-days")
    public static class WorkingDays{}

    @ConditionalOnProperty(value = "zoo.open", havingValue = "true")
    public static class Open{}
}
