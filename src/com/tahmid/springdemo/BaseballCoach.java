package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "30 mins pitching practice";
    }
}
