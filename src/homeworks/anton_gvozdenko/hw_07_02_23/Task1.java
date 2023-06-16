package homeworks.anton_gvozdenko.hw_07_02_23;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(18, 60);
            System.out.print(array[i] + " ");

        }
        System.out.println();

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                ++countEven;
            }
        }
        System.out.println(countEven + " ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                ++countOdd;
            }
        }
        System.out.println(countOdd + " ");

        if (countOdd > countEven) {
            System.out.println("Нечётных больше");
        } else if (countEven > countOdd) {
            System.out.println("Чётных больше");
        } else {
            System.out.println("Равно");
        }
    }
}
















