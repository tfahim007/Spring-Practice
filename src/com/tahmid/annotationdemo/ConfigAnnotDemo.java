package com.tahmid.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tahmidul Islam
 */
public class ConfigAnnotDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
