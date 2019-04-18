package com.company;

public class LoudDog extends Dog
{
    public LoudDog(String myName){
        super(myName);
    }

    @Override
    public String speak()
    {
        return super.speak() + super.speak();
    }
}

