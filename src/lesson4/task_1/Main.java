package lesson4.task_1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(Arrays.asList("красный", "оранжевый", "жёлтый", "зелёный", "голубой", "синий", "фиолетовый", "красный", "зелёный", "синий", "коричневый", "красный", "чёрный"));
        Set<String> uniqueColor = new HashSet<>(color);

        System.out.println("Изначальный массив: ");
        System.out.println(color.toString());
        System.out.println("Уникальные значения: ");
        System.out.println(uniqueColor.toString());

        System.out.println("Сколько раз встречаются значения: ");
        for (String key : uniqueColor) {
            System.out.println(key + ": " + Collections.frequency(color, key) + ".");
        }
    }
}
