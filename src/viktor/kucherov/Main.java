package viktor.kucherov;
// 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
//
// 2. Написать простой класс Телефонный Справочник,
// который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи,
// а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией
// может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1 task
        String[] animals = new String[]{
                "Кошка", "Собака", "Мышь", "Кролик",
                "Корова", "Лев", "Лиса", "Кошка",
                "Медведь", "Коза", "Овца", "Собака",
                "Мышь", "Кролик", "Корова", "Лев",
                "Волк", "Собака", "Мышь", "Лошадь"
        };
        Map<String, Integer> animalCountMap = createTheAnimalCounter(animals);

        //2 task
        PhoneBook pb = new PhoneBook();
        pb.add("Kucherov", "+79880125898");
        pb.add("Ivanov", "+79880222298");
        pb.add("Kucherov", "+79999999999");
        pb.add("Sidorov", "+19034774663");

        pb.get("Jackson");
        pb.get("Kucherov");
        pb.get("Sidorov");



    }

    public static Map<String, Integer> createTheAnimalCounter(String[] animalsArray) {
        System.out.format("Количество животных в массиве равно: %d%n", animalsArray.length);

        ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animalsArray));

        Map<String, Integer> animalCountMap = new HashMap<>();
        for (String e: animalsList) {
            animalCountMap.put(e, animalCountMap.getOrDefault(e, 0) + 1);
        }
        for ( Map.Entry entry : animalCountMap.entrySet()) {
            System.out.println("Животных вида \"" + entry.getKey() + "\" : представлено в количестве " + entry.getValue());
        }

        return animalCountMap;
    }
}
