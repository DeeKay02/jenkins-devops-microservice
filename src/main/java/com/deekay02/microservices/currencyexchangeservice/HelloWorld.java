package com.deekay02.microservices.currencyexchangeservice;

public class HelloWorld {

    public String sayHello(String name) {

        System.out.println("sayHello called with name : " + name);
        return "Hello " + name;
    }

}
