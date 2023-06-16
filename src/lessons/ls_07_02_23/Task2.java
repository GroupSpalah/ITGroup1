package lessons.ls_07_02_23;

import java.util.Random;

/**
 * Дан массив  − 19  элементов целого типа от -5 до 5. Если отрицательных
 * элементов нет, то выдать соответствующее сообщение.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[19];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-1, 5);
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        boolean isNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
//                System.out.println("There is negative elements");
                isNegative = true;
                break;
            }

        }

        if (isNegative) {
            System.out.println("There is negative elements");
        } else {
            System.out.println("There isn't negative elements");
        }
    }
}
