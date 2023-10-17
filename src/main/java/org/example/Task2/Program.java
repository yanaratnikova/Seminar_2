package org.example.Task2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Персик");
        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        List<Rannable> list = new ArrayList<>();
        list.add(cat1);
        list.add(dog1);
        processRun(list);

    }
    static void processRun(List<Rannable> animals){
        for (Rannable animal: animals) {
            animal.run();
        }

    }
}
