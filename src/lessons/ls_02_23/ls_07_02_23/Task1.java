package lessons.ls_02_23.ls_07_02_23;

import java.util.Random;

/**
 * Дан массив  − 19  элементов целого типа.
 * Найти сумму элементов, расположенных до первого отрицательного элемента.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[19];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-3, 10);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                break;
            }

            sum += array[i];
        }

        System.out.println("Sum = " + sum);
    }
}
