package lessons.ls_02_23.ls_14_02_23.two_dim_array;

import java.util.Random;

public class TwoDimArray {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 9, 6};

        int[][] array = {
                {4, 7, 9},//0
                {5},//1
                {7, 4, 0, 5}//2
        };

//        System.out.println(array[0][1]);

        int[][] array2 = new int[4][5];//0

        Random random = new Random();

        for (int i = 0; i < array2.length; i++) {
            for (int k = 0; k < array2[i].length; k++) {
                array2[i][k] = random.nextInt(20);
                System.out.print(array2[i][k] +"\t");
            }
            System.out.println();
        }

        int max = array2[0][0];

        for (int i = 0; i < array2.length; i++) {
            for (int k = 0; k < array2[i].length; k++) {
                if (array2[i][k] > max) {
                    max = array2[i][k];
                }
            }
        }

    }
}
