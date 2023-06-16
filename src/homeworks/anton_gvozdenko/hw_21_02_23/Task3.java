package homeworks.anton_gvozdenko.hw_21_02_23;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(10, 50);
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {

                int sum = i + x;
                if (sum % 2 == 0) {
                    System.out.print(array[i][x] + " ");
                }
            }
        }
    }
}

