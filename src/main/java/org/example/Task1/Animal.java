package org.example.Task1;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void voice();
    /*{
        System.out.println("Животное подает голос");
    }*/
    public abstract void jump();
    /*{
      System.out.println("Животное прыгает");
    }*/
}
