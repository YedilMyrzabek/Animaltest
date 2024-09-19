package org.example;

public abstract class Shape implements IGetInfo{
    protected String color;
    protected String name;

    public Shape(String name,String color){
        this.color = color;
        this.name = name;
    }

    public String getInfo(){
        return "My name is: " + name
                + "My color is: " + color;
    }
}
