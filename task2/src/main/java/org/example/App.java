package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        autoFactory.setProductionSize(4);
        int sedansBuilt = autoFactory.runProduction();
        System.out.println((sedansBuilt) + " cars built in total");
    }
}
