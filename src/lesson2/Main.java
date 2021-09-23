package lesson2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException {
        try {
            stringToInt();
        } catch (MyArraySizeException e) {

            System.out.println("Введен массив некорректного размера!!!");
        }
    }

    private static void stringToInt() throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[][]{{"10", "4", "6", "9"},{"7", "5", "5", "1"}, {"0", "llk", "7", "4"}, {"10", "4", "6", "9"}};
        int sum = 0;
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    value = Integer.parseInt(arr[i][j]);

                } catch (IllegalArgumentException e) {
                    System.out.println("Веден некоррекный элемент массива  в ячейке [" + i + ":" + j + "]");
                }
                sum += value;
            }
        }
        System.out.println("Сумма элементов массива " + sum);
    }
}




