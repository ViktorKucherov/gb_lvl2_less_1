package viktor.kucherov;

public class Wall {

    //свойства класса
    private double height;

    //сеттеры
    public void setHeight(int height) {
        this.height = height;
    }

    //геттеры
    public double getHeight() {
        return height;
    }


    public Wall(double height) {
        this.height = height;
    }
}
