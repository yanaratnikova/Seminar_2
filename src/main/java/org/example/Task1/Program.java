package org.example.Task1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Рыжий");
        Dog dog1 = new Dog(12);
        //Animal animal = new Animal();
        cat1.setName("Персик");
        dog1.setName("Дружок");
        //System.out.println(cat1.getName());
        //dog1.jump();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        processVoice(animals);
    }
    static void processVoice(List<Animal> animals){
        for (Animal animal:animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println("Цвет котика: " + cat.getColor());
                //animal.voice();
            }
            if (animal instanceof Dog){
                Dog dog = (Dog)animal;
                System.out.println("Вес собаки: "+ dog.getWeight());
            }
            animal.voice();
        }
    }
}
