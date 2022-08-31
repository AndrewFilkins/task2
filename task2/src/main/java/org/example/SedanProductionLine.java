package org.example;

import org.springframework.stereotype.Component;

import java.util.*;

@Component("sedanPL")
public class SedanProductionLine implements ProductionLine {
    @Override
    public Car work() {
        System.out.println("SEDAN is getting built...");
        Random random = new Random();
        return new Car(random.nextBoolean());
    }
}
