package homeworks.anton_gvozdenko.hw_21_02_23;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(30);
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                if (i == 0) {
                    sum += array[i][x];
                }
                if (i == array.length - 1) {
                    sum1 += array[i][x];
                }
            }
        }
        System.out.println("Sum of first row = " + sum);
        System.out.println("Sum of last row = " + sum1);
    }
}
