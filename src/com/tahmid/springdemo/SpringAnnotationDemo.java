package com.tahmid.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */

public class SpringAnnotationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
        Coach theCoach = context.getBean("theSillyCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
