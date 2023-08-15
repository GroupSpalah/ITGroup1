package lessons.ls_08_23.ls_11_08_23;

import java.util.HashMap;
import java.util.Random;

public class LearnRecoursion {

    private static int[] array = new int[10];

    static {
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(50);
        }
    }

    public static void printArrayByRecoursion(int value) {//10
        if (value == 0) {
            return;
        }

        System.out.print(array[value - 1] + "\t");//array[9]

        printArrayByRecoursion(value - 1);
    }

    /**
     * 12	24	36	37	37	38	43	43	40	6
     * first call - value - 10, value - 1 = 9, sout(array[9]) - 6
     * second call - value - 9, value - 1 = 8, sout(array[8]) - 40
     * third call -  value - 8, value - 1 = 7, sout(array[7]) - 43
     */

    /**
     * 5! = 1 * 2 * 3 * 4 * 5 = 120
     * 1! = 1
     * 2! = 2
     */

    public static long calculateFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return calculateFactorial(n - 1) * n;
    }

    /**
     *  n = 5, return calculateFactorial(5 - 1) * 5; -> 24 * 5
     *  n = 4, return calculateFactorial(4 - 1) * 4; -> 6 * 4
     *  n = 3, return calculateFactorial(3 - 1) * 3; -> 2 * 3
     *  n = 2, return calculateFactorial(2 - 1) * 2; -> 2
     *
     */

    public static void getAllNumbersBetweenTwoNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        }

        System.out.print(a + " ");

        getAllNumbersBetweenTwoNumbers(++a, b);
    }

    public static void main(String[] args) {
//        printArrayByRecoursion(array.length);
//        System.out.println(calculateFactorial(5));
//        getAllNumbersBetweenTwoNumbers(10, 20);

        int a = 1985;

        int b = a % 10;

        int c = a / 10;

        System.out.println(b);
        System.out.println(c);

    }

    public static void print() {
        print();
    }
}
