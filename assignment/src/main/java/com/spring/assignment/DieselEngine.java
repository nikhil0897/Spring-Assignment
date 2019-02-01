package com.spring.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    //if we have more than one component on the class path of the same type, we have to make one of them Primary. Primary gives more important to that particular component
public class DieselEngine implements EngineType {
    public String getEngine(String engineEnquiry) {

        return "Spring: I say you should go for Diesel Engine.";    //this will be returned to String selectedEngine
    }

}

//If I haven't had used Primary here it will show an error and won't complete the execution and output "APPLICATION FAILED TO START, Car required a single bean, but 2 were found"