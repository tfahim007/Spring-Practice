package com.tahmid.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tahmidul Islam
 */
public class AnnotDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
    }
}
