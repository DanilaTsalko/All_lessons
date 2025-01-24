package lesson_13;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
            return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление записей
        phoneBook.add("Ivanov", "123456");
        phoneBook.add("Petrov", "234567");
        phoneBook.add("Ivanov", "345678");

        // Поиск записей
        System.out.println("Ivanov's numbers: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov's numbers: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov's numbers: " + phoneBook.get("Sidorov"));
    }
}


