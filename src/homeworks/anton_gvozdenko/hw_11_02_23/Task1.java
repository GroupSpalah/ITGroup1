package homeworks.anton_gvozdenko.hw_11_02_23;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
                int numb = array[i];
            }
        }
        System.out.println();
        for (int numb : array) {
            System.out.print(numb + " ");
        }
    }
}



