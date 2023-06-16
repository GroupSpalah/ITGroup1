package lessons.ls_14_02_23.two_dim_array;

import java.util.Random;

/**
 * В двумерном массиве целых чисел определить, сколько раз в нем встречается элемент со значением X.
 */
public class Task1 {
    public static void main(String[] args) {

        int[][] array = new int[4][5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = random.nextInt(4, 10);
                System.out.print(array[i][k] +"\t");
            }
            System.out.println();
        }

        int value = 5;

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] == value) {
                    ++count;
                }
            }
        }

        System.out.println("Count = " + count);

    }
}
