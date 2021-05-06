package viktor.kucherov;

public class Competition {

    public void competition(Person[] sportsmen) {

        boolean status;
        for (int i = 0; i < sportsmen.length; i++) {
            //прыжки
            status = sportsmen[i].jumpThroughWall(new Wall(10.5));
            System.out.println(sportsmen[i].successJumpStatus(status));
            if (!status) {
                System.out.format("%s до финиша не дошел! %n", sportsmen[i].getName());
                continue;
            }
            //бег
            status = sportsmen[i].runThroughTreadmill(new Treadmill(15_000));
            System.out.println(sportsmen[i].successRunStatus(status));
            if (!status) {
                System.out.format("%s до финиша не дошел! %n", sportsmen[i].getName());
                continue;
            } else {
                System.out.format("%s дошел до финиша! %n", sportsmen[i].getName());
            }

        }
    }
}
