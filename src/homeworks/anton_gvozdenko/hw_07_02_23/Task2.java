package homeworks.anton_gvozdenko.hw_07_02_23;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(18, 60);
            System.out.print(array[i] + " ");
        }
        int maxNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.print("Максимальное згачение = " + maxNumber + " ");
        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.print("Минимальное значение = " + minNumber + " ");

    }
}
