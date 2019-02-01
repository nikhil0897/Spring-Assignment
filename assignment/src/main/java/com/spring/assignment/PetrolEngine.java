package com.spring.assignment;

import org.springframework.stereotype.Component;

@Component    //tells the Spring that this is a bean
public class PetrolEngine implements EngineType {
    public String getEngine(String engineEnquiry) {

        return "Spring: I say you should go for Petrol Engine.";
    }
}
