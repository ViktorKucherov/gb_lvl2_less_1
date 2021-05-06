package viktor.kucherov;

public class Person implements PlayerActions {

    private String name;
    private double max_jump_height = 1.9;
    private int max_run_distance = 10_000;

    //сеттеры класса
    public void setMax_jump_height(double max_jump_height) {
        this.max_jump_height = max_jump_height;
    }

    public void setMax_run_distance(int max_run_distance) {
        this.max_run_distance = max_run_distance;
    }

    //геттеры класса

    public String getName() {
        return name;
    }

    public double getMax_jump_height() {
        return max_jump_height;
    }

    public int getMax_run_distance() {
        return max_run_distance;
    }
    Person(String name) {
        this.name = name;
    }


    @Override
    public void runInfo() {
        System.out.println("Этот человек умеет бегать");
    }

    @Override
    public void jumpInfo() {
        System.out.println("Этот человек умеет прыгать");
    }

    @Override
    public boolean runThroughTreadmill(Treadmill treadmill) {
        System.out.format("%s пытается пробежать дистанцию равную %d м.%n", this.name, treadmill.getDistance());
        return treadmill.getDistance() <= getMax_run_distance();
    }

    @Override
    public boolean jumpThroughWall(Wall wall) {
        System.out.format("%s пытается перепрыгнуть стену, равную %f м.%n", this.name, wall.getHeight());
        return wall.getHeight() <= getMax_jump_height();
    }

    @Override
    public String successRunStatus(boolean status) {
        String result = (status == true) ? getName() + " УСПЕШНО ПРОБЕЖАЛ" : getName() + " НЕ СМОГ ПРОБЕЖАТЬ";
        return result;
    }

    @Override
    public String successJumpStatus(boolean status) {
        String result = (status == true) ? getName() + " УСПЕШНО ПЕРЕПРЫГНУЛ" : getName() + " НЕ СМОГ ПЕРЕПРЫГНУТЬ";
        return result;
    }

}
