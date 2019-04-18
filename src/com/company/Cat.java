package com.company;

public class Cat extends Pet {

    public Cat(String myName) {
        super(myName);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
