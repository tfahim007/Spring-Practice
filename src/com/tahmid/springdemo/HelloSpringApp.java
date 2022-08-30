package com.tahmid.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tahmidul Islam
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        //Loading the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //close Context
        context.close();
    }
}
