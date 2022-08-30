package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String team;
    private String emailAddress;
    @Override
    public String getDailyWorkout() {
        return "Fielding Practice and Bowling Practice " + team + " " + emailAddress;
    }

    @Override
    public String getDailyFortune() {
        return "You have been Imrul Kayessed";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
