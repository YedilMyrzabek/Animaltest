package org.example;

public class Rigtengle extends Shape{
    protected int sideA;
    protected int sideB;

    public Rigtengle(String name, String color,int sideA,int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "Side A:" + sideA
                + "Side B:" + sideB;
    }
}
