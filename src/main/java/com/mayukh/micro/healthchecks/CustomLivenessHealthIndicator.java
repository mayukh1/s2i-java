package com.mayukh.micro.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomLivenessHealthIndicator implements HealthIndicator{
    @Override
    public Health health(){
        boolean appIsAlive = checkIfAppIsAlive(); // Your custom logic
                return appIsAlive ? Health.up().build() : Health.down().build();
            }
        
            private boolean checkIfAppIsAlive() {
                // TODO Auto-generated method stub
                return true;
            }
    
}