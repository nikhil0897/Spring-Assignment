package com.spring.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication    //SpringBoot will automatically scan package where main application class is present
public class AssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AssignmentApplication.class, args);	//ApplicationContext manages all the beans

		Car finalCarEngine = appContext.getBean(Car.class);	//here appContext is getting the bean for us from Car.class

		System.out.println();
		String result = finalCarEngine.carManufacture("What engine to choose?");    //we are trying to know what engine to use in the car here
		System.out.println(result);    //this will output the string that was returned by DieselEngine
		System.out.println("Me: Okay, thanks Spring.");
	}

}

/* What am I doing here is instead of creating instances of PetrolEngine and DieselEngine ourselves and wiring them together
 * we made Spring to create the bean and wire them together. Furthermore, we are getting the Car bean from Spring and we are printing the result
 *
 * Spring manages the dependencies, injects them when required and manages the life cycle of the beans as well, it is called Dependency Management
 *
 * Output:
 * Me: Which engine do you prefer for me Spring?
 * Spring: Hey Nikhil, I prefer com.spring.assignment.DieselEngine@1b8a29df
 * Me: Oh Spring, English please, English!
 * Spring: I say you should go for Diesel Engine.
 * Me: Okay, thanks Spring.
 */