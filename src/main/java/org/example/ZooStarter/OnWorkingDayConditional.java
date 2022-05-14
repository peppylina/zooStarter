package org.example.ZooStarter;

import lombok.Data;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.List;
import java.util.Scanner;

@Data
public class OnWorkingDayConditional implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // Спрашиваем у пользователя какой сегодня день недели
        System.out.println("What is the day of week today?");
        Scanner in = new Scanner(System.in);
        String today = in.nextLine();

        // Получаем проперти с рабочими днями
        List<String> workingDays = ZooProperties.getWorkingDaysFromConditionContext(conditionContext);

        return workingDays.contains(today);
    }
}
