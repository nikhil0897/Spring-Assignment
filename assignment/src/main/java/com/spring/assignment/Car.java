package com.spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component    //Component defines this as a bean
public class Car {

    @Autowired    //this will tell the Spring that it is a dependency, which means Car depends on EngineType
    private EngineType engineType;    //interface making the code loosely coupled

    public Car(EngineType engineType) {    //passing the dependency to Car
        super();
        this.engineType = engineType;
    }

    public String carManufacture( String engineEnquiry ) {


        String selectedEngine = engineType.getEngine(engineEnquiry);
        System.out.println("Me: Hey Spring, which engine do you prefer for my car?");
        System.out.println("Spring: Hey Nikhil, I prefer " + engineType);
        System.out.println("Me: Oh Spring, English please, English!");
        return selectedEngine;    //this is returned to String result
    }

}

/* On asking Spring which engine to go for, it will automatically give me the output based on which bean to choose from
 * So I don't need to worry about creating instances and initialize them
 * This might not seem very useful here but think big, think about a project with 1000 dependencies and 2000 beans
 */
