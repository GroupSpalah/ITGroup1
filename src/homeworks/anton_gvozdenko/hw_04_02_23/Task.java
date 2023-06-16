package homeworks.anton_gvozdenko.hw_04_02_23;

import java.util.Random;

public class Task {
    public static void main(String[] args) {
        int[] numb = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; ++i) {
            numb[i] = random.nextInt(18, 57);
            if (i > 8 && i <= 15) {
                System.out.print(numb[i] + " ");
            }

        }
    }
}












