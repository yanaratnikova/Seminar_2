package org.example.Task1;

public class Dog extends Animal{
    private double weight;

    public Dog(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }

}
