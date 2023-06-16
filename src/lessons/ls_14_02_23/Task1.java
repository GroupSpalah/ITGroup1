package lessons.ls_14_02_23;

/**
 * Даны два массива действительных чисел по 12 элементов в каждом.
 * Заменить нулями те элементы первого массива, которые есть во втором.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 9, 6};
        int[] array2 = {4, 3, 1, 8, 6};

        for (int i = 0; i < array1.length; i++) {//5

            int element = array1[i];

            for (int j = 0; j < array2.length; j++) {//25
                if (array2[j] == element) {
                    array1[i] = 0;
                }
            }
        }
    }
}
