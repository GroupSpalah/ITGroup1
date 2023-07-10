package lessons.ls_02_23.ls_07_02_23;

import java.util.Random;

/**
 Дан массив чисел. В массиве числа в диапазоне от 5 до 15.
 Определить максимальный и минимальный элементы
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[19];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5, 15);
            System.out.print(array[i] + "\t");
        }

        int maxElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("Max = " + maxElement);

    }
}
