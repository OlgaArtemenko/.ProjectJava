package lesson5;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Main5 {
    public static void main(String[] args) {
        File myFile = new File("test.csv");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.csv"))) {

            writer.write("Value 1;Value 2;Value 3\n100;200;123\n300;400;500");

        } catch (IOException e) {
            e.printStackTrace();
        }

        AppData data1 = new AppData();
        data1.readCSVFile("test.csv");

        System.out.println(Arrays.toString(data1.getHeader()));
        System.out.println(Arrays.deepToString(data1.getData()));

        data1.writeCSVFile("test1.csv");
    }
}









