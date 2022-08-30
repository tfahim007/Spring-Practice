package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class FootballCoach implements Coach{
    private FortuneService service;

    public FootballCoach(FortuneService service){
        this.service = service;
    }
    @Override
    public String getDailyWorkout() {
        return "60 mins of Free Kick";
    }

    @Override
    public String getDailyFortune() {
        return service.getDailyFortune();
    }
}
