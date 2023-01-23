package com.percipio.aop.vehicles;

public class Car {
    public void drive(int speed) {
        //meeting tracing concern
        //System.out.println("Starting to log (from Car class): Car is driving");

        //actual business logic for driving
        System.out.println("I am driving at the speed of " + speed + " km/h");
    }

    public void stop() {
        System.out.println("Braking for a stop");
    }
}
