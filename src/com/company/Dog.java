package com.company;

public class Dog extends Pet {

    public Dog(String myName){
        super(myName);
    }

    @Override
    public String speak(){
        return "Woof!";
    }
}
