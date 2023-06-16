package homeworks.anton_gvozdenko.hw_14_02_23;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                array[i][x] = random.nextInt(30);
                System.out.print(array[i][x] + " ");
            }
            System.out.println();
        }
        int maxNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                if (array[i][x] > maxNumber) {
                    maxNumber = array[i][x];
                }
            }
        }
        System.out.print(maxNumber + " ");

        System.out.println();
        int minNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                if (array[i][x] < minNumber) {
                    minNumber = array[i][x];
                }
            }
        }
        System.out.println(minNumber + " ");

        double sum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                sum += array[i][x];
            }
        }

        System.out.print(sum + " ");

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                if (array[i][x] % 2 == 0) {
                    ++countEven;
                }
            }
        }
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                if (array[i][x] % 2 == 1) {
                    ++countOdd;
                }
            }
        }
        int countNumber = countOdd + countEven;
        double result = sum / countNumber;
        System.out.print(countNumber + " ");
        System.out.println();
        System.out.print(result + " ");

    }
}

