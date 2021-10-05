package lesson4.task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        book.add("Petrov", "+79257905634");
        book.add("Petrov", "+79257895634");
        book.add("Vasichkin", "+79277845378");
        book.add("Ivanov", "+79296499321");
        book.add("Ivanov", "+79226495426");
        book.add("Petuhov", "+79778653293");
        book.add("Gorbachev", "+79688369014");
        book.add("Michaylov", "+79660935829");

        book.getInfo();

        System.out.println("_______________________");

        book.get("Ivanov");
    }
}

