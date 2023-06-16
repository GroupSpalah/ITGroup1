package lessons.ls_18_02_23;

import java.util.Random;

public class WorkWithRows {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = random.nextInt( 60);
                System.out.print(array[i][k] +"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            int maxRow = array[i][0];

            for (int k = 0; k < array[i].length; k++) {

                if (array[i][k] > maxRow) {
                    maxRow = array[i][k];
                }
            }

            System.out.println("Max row = " + maxRow);
        }
    }
}
