package lessons.ls_04_02_23;

public class LoopsSum {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}

/**
 * iter0: i == 0; sum = 0;
 * iter1: i == 1; sum = 0 + 1;
 * iter2: i == 2; sum = 0 + 1;
 * iter3: i == 3; sum = 1 + 3;
 *
 */
