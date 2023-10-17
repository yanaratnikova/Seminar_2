package org.example.Task2;

public class Dog extends BaseDog implements Rannable{
    @Override
    public void run() {
        System.out.println("Собака бежит");
    }
}
