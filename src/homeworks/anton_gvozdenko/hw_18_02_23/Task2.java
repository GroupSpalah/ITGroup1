package homeworks.anton_gvozdenko.hw_18_02_23;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        int array[][] = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(30);
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int x = 0; x < array.length; x++) {
                if (i == x) {
                    sum = array[i][x];
                }
            }

            System.out.print(sum + " ");
        }
    }
}



