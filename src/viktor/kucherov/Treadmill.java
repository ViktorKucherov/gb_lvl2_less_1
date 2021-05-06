package viktor.kucherov;

class Treadmill {
    //свойства класса
    private int distance;

    //сеттеры
    public void setDistance(int distance) {
        this.distance = distance;
    }

    //геттеры
    public int getDistance() {
        return distance;
    }


    public Treadmill(int distance) {
        this.distance = distance;
    }
}