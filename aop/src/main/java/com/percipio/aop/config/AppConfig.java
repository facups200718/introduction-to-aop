package com.percipio.aop.config;

import com.percipio.aop.vehicles.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Pasamos toda la configuración de appContext.xml a java
@Configuration
@ComponentScan("com.percipio.aop.aspects")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean("car")
    public Car getCar() {
        return new Car();
    }
}
