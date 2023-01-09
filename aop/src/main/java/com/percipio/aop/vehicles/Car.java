package com.percipio.aop.vehicles;

public class Car {
    public void drive() {
        //meeting tracing concern
        //System.out.println("Starting to log (from Car class): Car is driving");

        //actual business logic for driving
        System.out.println("Accelerating and moving");
    }

    public void stop() {
        System.out.println("Braking for a stop");
    }
}
