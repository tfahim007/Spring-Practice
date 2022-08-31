package com.tahmid.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Component()
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "20 mins of backhand";
    }

    @Override
    public String getDailyFortune() {
        return "No luck Ptday!";
    }
}
