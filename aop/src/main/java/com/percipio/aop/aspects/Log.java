package com.percipio.aop.aspects;

public class Log {
    public void vehicleAboutToMove() {
        System.out.println("Saving to log: Vehicle action: About to move");
    }

    public void vehicleAboutToStop() {
        System.out.println("Saving to log: Vehicle action: About to stop");
    }
}
