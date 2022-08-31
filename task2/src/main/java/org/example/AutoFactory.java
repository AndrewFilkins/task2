package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;
    @Autowired
    private PartsChecker partsChecker;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public int runProduction() {
        int carsBuilt = 0;
        int i = 0;
        while (i < productionSize) {
            Car car = productionLine.work();
            if (partsChecker.checkParts(car)) {
                System.out.println("DONE!\n");
                carsBuilt++;
            }
            else
                System.out.println("... but parts are missing\n");
            i++;
        }
        return carsBuilt;
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("init method");
    }
}
