package com.percipio.aop;

import com.percipio.aop.config.AppConfig;
import com.percipio.aop.vehicles.Car;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		//Esto es por si queremos establecer la configuracion con un archivo xml
		//var applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

		var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	    Car myCar = applicationContext.getBean("car", Car.class);
		try {
			myCar.drive(120);
		} catch (Exception exception) {
			System.out.println("Oops! No driving today.");
			System.out.println(exception);
		}

		applicationContext.close();

	}

}
