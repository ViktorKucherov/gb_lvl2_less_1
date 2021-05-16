package viktor.kucherov;

import java.util.*;

public class PhoneBook {


    private Map<String, Set<String>> phoneBookRecordings = new HashMap<String, Set<String>>();

    PhoneBook() {
        System.out.println();
        System.out.println("=== ТЕЛЕФОННЫЙ СПРАВОЧНИК СОЗДАН ===");
        System.out.println();
    }

    public void add(String surname, String phoneNumber) {
        if (surname == null || surname.equals("")) {
            System.out.println("Попытка записи недопустимого значения, операция не выполнена.");
            return;
        }
        if (phoneBookRecordings.containsKey(surname)) {
            System.out.println("Фамилия " + surname +" уже содержится в справочнике.");
            Set<String> tmpSet = phoneBookRecordings.get(surname);
            if (tmpSet.contains(phoneNumber)) {
                System.out.println("Данный телефон уже содержится в справочнике, операция не выполнена!");
            } else {
                System.out.format("Для фамилии %s добавлен новый телефон %s.%n", surname, phoneNumber);
                tmpSet.add(phoneNumber);
                phoneBookRecordings.put(surname, tmpSet);
            }
        } else {
            Set<String> newSet = new HashSet<>();
            newSet.add(phoneNumber);
            System.out.format("Для новой фамилии %s добавлен новый телефон %s.%n", surname, phoneNumber);
            phoneBookRecordings.put(surname, newSet);
        }
    }


    public void get(String surname) {
        if(!phoneBookRecordings.containsKey(surname)) {
            System.out.println();
            System.out.format("======= ТЕЛЕФОНЫ ПО ФАМИЛИИ \"%s\" =======%n", surname);
            System.out.println();
            System.out.format("Записей не обнаружено.%n");
            System.out.println();
        } else {
            Set<String> tmpSet = phoneBookRecordings.get(surname);
            Iterator itr = tmpSet.iterator();
            System.out.println();
            System.out.format("======= ТЕЛЕФОНЫ ПО ФАМИЛИИ \"%s\" =======%n", surname);

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            System.out.format("Всего найдено записей в справочнике: %s.%n", tmpSet.size());

        }
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookRecordings=" + phoneBookRecordings +
                '}';
    }
}
