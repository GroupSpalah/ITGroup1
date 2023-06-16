package homeworks.anton_gvozdenko.hw_14_02_23;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(10, 100);
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                sum = array[i][x] / 10 + array[i][x] % 10;
                if (sum % 2 == 0) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

    }
}





