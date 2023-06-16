package lessons.ls_04_02_23;

public class LoopsCount {
    public static void main(String[] args) {

        int countOdd = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                ++countOdd;
            }
        }

        System.out.println(countOdd);
    }
}

/**
 * iter0: i == 0; countOdd = 0;
 * iter1: i == 1; countOdd = 0 + 1;
 * iter2: i == 2; countOdd = 0 + 1;
 * iter3: i == 3; countOdd = 1 + 1;
 *
 */
