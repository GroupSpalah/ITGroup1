package lessons.ls_02_23.ls_11_02_23;

/**
 * Сложить два массива произвольной длины каждый.
 */
public class Task1 {
    public static void main(String[] args) {

//        int a, b = 10;
        int a1 = 7, b1 = 10;

        int[] array1 = {7, 8, 9, 2, 3};
        int[] array2 = new int[]{1, 0, 5, 9, 6, 4, 6};

        int[] array3 = new int[array1.length + array2.length];//0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0

        for (int i = 0; i < array1.length; i++) {//i == 4
            array3[i] = array1[i];
        }
        //array3 - 7, 8, 9, 2, 3, 0, 0, 0, 0, 0, 0, 0

        for (int i = array1.length, j = 0; j < array2.length; i++, ++j) {
            array3[i] = array2[j];
        }
        //array3 - 7, 8, 9, 2, 3, 1, 0, 5, 9, 6, 4, 6
    }
}
