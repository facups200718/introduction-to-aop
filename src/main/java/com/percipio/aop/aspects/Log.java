package com.percipio.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Indicamos que es un componente para que el escaneo detallado en el application context lo encuentre
//y también indicamos que es un aspect
@Component
@Aspect
public class Log {

    //Indicamos a traves de las anotaciones que este metodo se va a ejecutar antes siempre que ejecutemos drive(..) de la clase Car
    //Agregamos los dos puntitos adentro de los paréntesis para indicar la presencia de parámetros
    @Before("execution(void com.percipio.aop.vehicles.Car.drive(..))")
    public void vehicleAboutToMove(JoinPoint joinPoint) { //Obtenemos por parametros el joinpoint que es el metodo a donde estamos apuntando
        System.out.println("Saving to log: Vehicle action: About to move");

        System.out.println("Tipo de joinpoint: " + joinPoint.getKind()); //spring solo soporta method-execution, asi que siempre va a ser este
        System.out.println("Parte estática del joinpoint: " + joinPoint.getStaticPart()); //Lo que triggerea el metodo en el que estamos ahora
        Object[] args = joinPoint.getArgs();
        Integer speed = ((Integer) args[0]).intValue();
        System.out.println("Valor que le pasamos al argumento del joinpoint: " + speed);
        System.out.println("Objetivo del joinpoint: " + joinPoint.getTarget()); //Ubicación del método
    }

    //Indicamos a traves de las anotaciones que este metodo se va a ejecutar antes siempre que ejecutemos stop() de la clase Car
    @Before("execution(void com.percipio.aop.vehicles.Car.stop())")
    public void vehicleAboutToStop() {
        System.out.println("Saving to log: Vehicle action: About to stop");
    }
}
