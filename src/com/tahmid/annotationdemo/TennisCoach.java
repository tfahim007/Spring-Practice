package com.tahmid.annotationdemo;

import com.tahmid.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Component
public class TennisCoach implements Coach{
    private FortuneServiceAnnot service;
    public TennisCoach(){
        System.out.println("Inside Tennis Default Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins Back Volley";
    }

    @Override
    public String getDailyFortune() {
        return service.getDailyFortune();
    }

    @Autowired
    public void setService(FortuneServiceAnnot service) {
        System.out.println("Inside Setter Injection");
        this.service = service;
    }
}
