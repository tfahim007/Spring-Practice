package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "60 mins of Free Kick";
    }
}
