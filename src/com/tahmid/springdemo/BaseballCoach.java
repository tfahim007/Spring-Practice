package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class BaseballCoach implements Coach{
    private FortuneService service;

    public BaseballCoach(FortuneService service){
        this.service = service;
    }

    public BaseballCoach() {

    }
    public void doMyStartUpStuff(){
        System.out.println("Inside Basketball: Startup");
    }
    public void doMyCleamUpStuff(){
        System.out.println("Inside Basketball: Destroy");
    }
    @Override
    public String getDailyWorkout() {
        return "30 mins pitching practice";
    }

    @Override
    public String getDailyFortune() {
        return service.getDailyFortune();
    }

}
