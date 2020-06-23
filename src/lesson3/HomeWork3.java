package lesson3;

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] words = {
                "Car", "Sun" , "Road", "Car", "Table", "Around", "Value", "Watch" , "Road", "Mouse"
        };
        Map<String, Integer> numCount = new HashMap<>();
        for (String num : words) {
            numCount.put(num, numCount.getOrDefault(num,0)+1);
        }
        System.out.println("Task 1:");
        System.out.println(numCount);
        System.out.println("--------------------");
        System.out.println("Task 2:");

        Phones book = new Phones();
        book.addContact("Sergeeva", "11111111");
        book.addContact("Kulyashov", "22222222");
        book.addContact("Kuznecov", "33333333");
        book.addContact("Osipova", "22222222");
        book.addContact("Ivanova", "5555555");
        book.addContact("Surkova", "99999999");
        book.addContact("Ivanova", "01010101");

        book.printName("Kozlov");
        book.printName("Osipova");
        book.printName("Ivanova");

    }
}
class Phones {
    HashMap<String, HashSet<String>> numberName;

    public Phones() {
        this.numberName = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = numberName.getOrDefault(name, new HashSet<>());
        book.add(phone);
        numberName.put(name, book);
    }

    public void printName(String name) {
        System.out.println("Name: " + name + " - Phone Number: " + numberName.getOrDefault(name, new HashSet<>()));
    }
}
