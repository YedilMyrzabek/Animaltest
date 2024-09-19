package org.example;

public class Animal implements IGetInfo{
    protected int age;
    protected double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void EatFood() {
        System.out.println("Animal is eating food");
    }

    public void PrintInfo() {
        System.out.println("My age is " + age + ", my weight is " + weight);
    }

    @Override
    public String getInfo() {
        return "Age: " + age
                + "Weight: " + weight;
    }
}
