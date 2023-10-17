package org.example.Task3;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Персик", 1700, 220),
                new Robot("C3PO", 99999, 0),
                new Robot("R2D2", 5000, 50),
                new Human("Василий", 2500,150),
                new Human("Петр", 3500,260)
        };
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250)
        };
        for (Runner runner:runners) {
            for (Obstacle obstacle: obstacles){
                if (obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength()))
                        break;
                }
                else if (obstacle instanceof Wall){
                    if(!runner.jamp(obstacle.getHeight()))
                        break;
                }
            }
        }
    }
}
