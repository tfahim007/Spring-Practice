package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Fielding Practice and Bowling Practice";
    }

    @Override
    public String getDailyFortune() {
        return "You have been Imrul Kayessed";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
