package homeworks.anton_gvozdenko.hw_11_02_23;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[19];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.print(maxNumber + " ");

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = maxNumber;
            }
            System.out.print(array[i] + " ");

        }
    }
}