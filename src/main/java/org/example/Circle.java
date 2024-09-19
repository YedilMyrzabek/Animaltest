package org.example;

public class Circle extends Shape{
    protected int radius;

    public Circle(String name, String color,int radius) {
        super(name, color);
        this.radius = radius;
    }

    static int gg = 5;

    @Override
    public String getInfo(){
        return super.getInfo()
                + "My radius " + radius;
    }
}
