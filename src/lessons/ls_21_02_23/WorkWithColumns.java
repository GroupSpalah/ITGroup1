package lessons.ls_21_02_23;

import java.util.Random;

public class WorkWithColumns {
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

        for (int i = 0; i < array[0].length; i++) {
            int maxColumn = array[0][i];

            for (int k = 0; k < array.length; k++) {

                if (array[k][i] > maxColumn) {
                    maxColumn = array[k][i];
                }
            }

            System.out.println("Max column = " + maxColumn);
        }
    }
}
