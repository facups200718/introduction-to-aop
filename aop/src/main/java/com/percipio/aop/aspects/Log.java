package com.percipio.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Indicamos que es un componente para que el escaneo detallado en el application context lo encuentre
//y también indicamos que es un aspect
@Component
@Aspect
public class Log {

    //Indicamos a traves de las anotaciones que este metodo se va a ejecutar antes siempre que ejecutemos drive() de la clase Car
    @Before("execution(void com.percipio.aop.vehicles.Car.drive())")
    public void vehicleAboutToMove() {
        System.out.println("Saving to log: Vehicle action: About to move");
    }

    @Before("execution(void com.percipio.aop.vehicles.Car.stop())")
    public void vehicleAboutToStop() {
        System.out.println("Saving to log: Vehicle action: About to stop");
    }
}
