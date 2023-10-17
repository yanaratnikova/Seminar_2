package org.example.Task3;

public class Robot extends BaseRobot implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if(length<= getMaxRun()){
            System.out.println(name + " Пробежал по дорожке " + length+ " метров.");
            return true;
        }else {
            System.out.println(name+" не смог пробежать по беговой дорожке "+length+" метров, остановился после " + getMaxRun());
            return false;
        }

    }

    @Override
    public boolean jamp(int height) {
        if(height<= getMaxJump()){
            System.out.println(name + " Перепрыгнул стену " + height+ " сантиметров.");
            return true;
        }else {
            System.out.println(name+" не смог перепрыгнуть через стену "+height+" сантиметров, остался на месте.");
            return false;
        }
    }
}
