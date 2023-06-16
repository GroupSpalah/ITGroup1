package homeworks.anton_gvozdenko.hw_07_02_23;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(18, 60);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        double sum = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array.length) {

            }
            sum += array[i];

        }
        System.out.print(sum + " ");
        double result = sum / array.length;
        System.out.println(result);
    }
}





