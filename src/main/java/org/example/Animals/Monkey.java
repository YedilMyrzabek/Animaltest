package org.example.Animals;

import org.example.Animal;

public class Monkey extends Animal {
    private String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }

    @Override
    public void EatFood() {
        System.out.println("This monkey loves " + foodType);
    }
}
