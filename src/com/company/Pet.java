package com.company;

public abstract class Pet
{
    private String myName;

    public Pet(String name)
    {
        this.myName = name;

    }

    public String getMyName()
    {
        return myName;
    }
    public abstract String speak();

}
