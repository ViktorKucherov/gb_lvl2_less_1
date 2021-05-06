package viktor.kucherov;
//TODO 1 задание:
// 1. Создайте три класса Человек, Кот, Робот,
// которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать
// (методы просто выводят информацию о действии в консоль).

//TODO 2 задание:
// 2. Создайте два класса: беговая дорожка и стена,
// при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль
// (успешно пробежал, не смог пробежать и т.д.).

// TODO 3. Создайте два массива: с участниками и препятствиями,
//  и заставьте всех участников пройти этот набор препятствий.

//TODO 4. У препятствий есть длина (для дорожки) или высота (для стены),
// а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий,
// то дальше по списку он препятствий не идет.

public class Main {







    public static void main(String[] args) {
        // TODO: Решение 1 задания:
        Person person = new Person("Загадочная личность");
        person.runInfo();
        person.jumpInfo();

        Cat barsik = new Cat("Барсик");
        barsik.runInfo();
        barsik.jumpInfo();

        Robot robocop = new Robot("RoboCop");
        robocop.runInfo();
        robocop.jumpInfo();

        // TODO: Решение 2 задания:
        boolean status;
        //прыжки
        status = person.jumpThroughWall(new Wall(5));
        System.out.println(person.successJumpStatus(status));

        status = barsik.jumpThroughWall(new Wall(1));
        System.out.println(barsik.successJumpStatus(status));

        status = robocop.jumpThroughWall(new Wall(2));
        System.out.println(robocop.successJumpStatus(status));

        //бег
        status = person.runThroughTreadmill(new Treadmill(5_000));
        System.out.println(person.successRunStatus(status));

        status = barsik.runThroughTreadmill(new Treadmill(100));
        System.out.println(barsik.successRunStatus(status));

        status = robocop.runThroughTreadmill(new Treadmill(1_000));
        System.out.println(robocop.successRunStatus(status));

        //TODO: Решение 3 задания:
        Person[] sportsman = new Person[3];
        sportsman[0] = new Person("Супермен");
        sportsman[0].setMax_jump_height(20_000);
        sportsman[0].setMax_run_distance(40_000_000);

        sportsman[1] = new Person("Бэтмен");
        sportsman[1].setMax_jump_height(100);
        sportsman[1].setMax_run_distance(50_000);

        sportsman[2] = new Person("Джокер");
        sportsman[2].setMax_jump_height(1.5);
        sportsman[2].setMax_run_distance(100);
        for (Person pers : sportsman
             ) {

            //прыжки
            status = pers.jumpThroughWall(new Wall(10.5));
            System.out.println(pers.successJumpStatus(status));

            //бег
            status = pers.runThroughTreadmill(new Treadmill(15_000));
            System.out.println(pers.successRunStatus(status));

        }

        //TODO: Решение 4 задания:
        Competition c = new Competition();
        c.competition(sportsman);




    }
}
