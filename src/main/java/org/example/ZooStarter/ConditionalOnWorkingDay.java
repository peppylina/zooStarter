package org.example.ZooStarter;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnWorkingDayConditional.class)
public @interface ConditionalOnWorkingDay {
}
