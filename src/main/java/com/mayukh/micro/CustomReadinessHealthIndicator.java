package com.mayukh.micro;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomReadinessHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        boolean isReady = checkReady();
                return isReady ? health().up().build() : health().down().build();
            }
        
            private boolean checkReady() {
                return true;
            }
}
