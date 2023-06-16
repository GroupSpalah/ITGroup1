package lessons.ls_07_02_23;

import java.util.Random;

/**
 Дан массив чисел. В массиве числа в диапазоне от -15 до 15.
 Выяснить, имеются ли в данном массиве два идущих подряд  положительных элемента. Подсчитать количество таких пар.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[19];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-15, 15);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        int countPairs = 0;
//        0 1 2 3 4
//        4 6 8 9 7

        for (int i = 0; i < array.length - 1; i++) {//i == 4
            if (array[i] > 0 && array[i + 1] > 0) {
                ++countPairs;
            }
        }

        System.out.println("Count pairs = " + countPairs);

    }
}
