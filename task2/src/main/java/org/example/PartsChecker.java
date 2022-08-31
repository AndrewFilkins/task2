package org.example;

import org.springframework.stereotype.Component;

@Component
public class PartsChecker {
    public boolean checkParts(Car car) {
        return car.isPartsDelivered();
    }
}
