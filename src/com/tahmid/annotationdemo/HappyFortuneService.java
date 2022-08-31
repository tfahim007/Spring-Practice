package com.tahmid.annotationdemo;

import org.springframework.stereotype.Component;

/**
 * @author Tahmidul Islam
 */
@Component
public class HappyFortuneService implements FortuneServiceAnnot {
    @Override
    public String getDailyFortune() {
        return "Shanti ar Shanti";
    }
}
