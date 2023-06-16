package homeworks.anton_gvozdenko.hw_21_02_23;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                array[i][x] = random.nextInt(30);
                System.out.print(array[i][x] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < array[0].length; i++) {
            int maxColumnElement = array[0][i];
            int minColumnElement = array[0][i];
            float sumColumnElement = 0;
            for (int x = 0; x < array.length; x++) {
                if (array[x][i] > maxColumnElement) {
                    maxColumnElement = array[x][i];
                }
                if (array[x][i] < minColumnElement) {
                    minColumnElement = array[x][i];
                }
                sumColumnElement += array[x][i];
            }
            System.out.println("Maximum element = " + maxColumnElement);
            System.out.println("Minimum element = " + minColumnElement);
            System.out.println("Sum = " + sumColumnElement);
        }
    }
}