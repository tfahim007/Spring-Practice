package com.tahmid.springdemo;

/**
 * @author Tahmidul Islam
 */
public class HappyFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
