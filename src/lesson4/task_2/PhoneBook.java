package lesson4.task_2;

import java.util.HashMap;
import java.util.*;


public class PhoneBook {
    private static HashMap<String, String> book = new HashMap<String, String>();


    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        book.put(lastName, phoneNumber);
    }

    public void getInfo() {
        for (Map.Entry<String, String> o : book.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }

    public void get(String lastName) {
        if (book.containsKey(lastName)) {
            System.out.println(lastName + "'s phone number >> " + book.get(lastName));
        } else {
            System.out.println("Sorry, no such Last name");
        }
    }
}







