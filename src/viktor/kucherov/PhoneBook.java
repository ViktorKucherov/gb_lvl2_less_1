package viktor.kucherov;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBookRecordings = new HashMap<>();

    public void addContact(String surname, String phonenumber) {
        for(Map.Entry<String, Set<String>> contact: phoneBookRecordings.entrySet()){
             if(contact.getKey().equals(surname)) {
                HashSet<String> tempSet = (HashSet<String>) contact.getValue();
                tempSet.add(phonenumber);
                contact.setValue(tempSet);
            } else {
                 HashSet<String> tempSet = new HashSet<>();
                 tempSet.add(phonenumber);
                 phoneBookRecordings.keySet(surname);

             }
        }
    }

    public void showPhoneBook(){
        for(Map.Entry<String, Set<String>> contact: phoneBookRecordings.entrySet()) {
            System.out.println("=========================");
            System.out.format("Контакты телефонного справочника с фамилией %s%n " +
                    "доступны по следующим номерам телефонов.%n", contact.getKey());
            System.out.println(contact.getValue());
            System.out.println("=========================");
        }
    }


}
