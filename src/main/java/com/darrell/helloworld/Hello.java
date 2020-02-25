package com.darrell.helloworld;

public class Hello {
    private String nameToGreet = new String();
    public Hello(){
        nameToGreet = "World";
    }
    public Hello(String name){
        nameToGreet = name;
    }
    public String getName(){
        return nameToGreet;
    }

    public String sayHello(){
        return "Hello, " + nameToGreet;
    }
}
