package lessons.ls_11_02_23;

import java.util.Random;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] array = new int[19];//0

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5, 10);
        }

        for (int element : array) {
            element = random.nextInt(5, 10);
        }

        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            element = 15;

            System.out.print(element + "\t");
        }

        for (int element : array) {
            System.out.print(element + "\t");
        }

    }
}
