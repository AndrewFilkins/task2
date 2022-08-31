package org.example;

import org.springframework.stereotype.Component;

@Component
public class CabrioletProductionLine implements ProductionLine {
    @Override
    public Car work() {
        System.out.println("CABRIOLET built");
        return new Car(true);
    }
}
