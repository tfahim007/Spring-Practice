package com.tahmid.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tahmidul Islam
 */
public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-lifecycleContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        boolean result = theCoach==alphaCoach;
        System.out.println(result);
        System.out.println(theCoach + " " + alphaCoach );
        context.close();
    }

}
