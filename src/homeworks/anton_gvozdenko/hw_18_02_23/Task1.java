package homeworks.anton_gvozdenko.hw_18_02_23;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {


        int array[][] = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(30);
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            int maxRowElement = array[i][0];
            int minRowElement = array[i][0];
            float sumRowElement = 0;
            float avrRowElement = 0f;
            for (int x = 0; x < array.length; x++) {
                if (array[i][x] > maxRowElement) {
                    maxRowElement = array[i][x];
                }

                if (minRowElement > array[i][x]) {
                    minRowElement = array[i][x];
                }

                sumRowElement += array[i][x];
                avrRowElement = sumRowElement / (array[0].length);
            }

            System.out.println();
            System.out.print("Максимальный элемент = " + maxRowElement + " ");
            System.out.println();
            System.out.print("Минимальный элемент = " + minRowElement + " ");
            System.out.println();
            System.out.print("Сумма = " + sumRowElement + " ");
            System.out.println();
            System.out.print("Сруднее арифметическое = " + avrRowElement + " ");
        }
    }
}
