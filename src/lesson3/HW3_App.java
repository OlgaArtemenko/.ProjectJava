package lesson3;

import java.util.Arrays;

public class HW3_App {
    public static void main(String[] args){
        //Задание 1
        System.out.println("Задание 1");
        String[] arr = {"1","gt","6","qw","8","jk"};
        System.out.println("Заданный массив   " + Arrays.toString(arr));
        swapElement(arr,3,5);
        System.out.println("Измененный массив " + Arrays.toString(arr));



        //Задание 2(Коробки с фруктами).
        System.out.println("Задание 2");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        for (int i = 0; i < 5; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 7; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 3; i++) {
            appleBox1.add(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            appleBox2.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();
        appleBox2.info();

        System.out.println("Вес коробки 1 с апельсинами составляет: " + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами составляет: " + orangeBox2.getWeight());
        System.out.println("Вес коробки 1 с яблоками составляет: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 с яблоками составляет: " + appleBox2.getWeight());

        System.out.println("Равен ли вес orangeBox1 и appleBox1 ? " + orangeBox1.compare(appleBox1));
        System.out.println("Равен ли вес коробок orangeBox2 и orangeBox1? " + orangeBox2.compare(orangeBox1));
        System.out.println("Равен ли вес appleBox1 и appleBox2 ? " + appleBox1.compare(appleBox2));

        System.out.println("Пересыпаем апельсины из одной коробки в другую:");
        orangeBox1.moveFruit(orangeBox2);
        System.out.println("Вес коробки 1 с апельсинами составляет: " + orangeBox1.getWeight());
        System.out.println("Вес коробки 2 с апельсинами составляет: " + orangeBox2.getWeight());

    }
    private static <T> void swapElement(T[]array,int index1, int index2){
    T x = array[index1];
    array[index1] = array[index2];
    array[index2] = x;
    }
}
