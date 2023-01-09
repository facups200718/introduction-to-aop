package com.percipio.aop.aspects;

public class Log {
    public void vehicleAboutToMove() {
        System.out.println("Starting to log (from Car class): Car is driving");
    }
}
