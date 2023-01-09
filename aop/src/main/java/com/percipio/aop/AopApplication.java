package com.percipio.aop;

import com.percipio.aop.vehicles.Car;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		var applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
	    Car myCar = applicationContext.getBean("car", Car.class);
		myCar.drive();
	}

}
