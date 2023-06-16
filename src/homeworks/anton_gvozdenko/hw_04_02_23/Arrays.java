package homeworks.anton_gvozdenko.hw_04_02_23;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; ++i) {
            array[i] = random.nextInt(1, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int[] array1 = new int[30];
        Random random1 = new Random();
        int a = 0;
        while (a < 30) {

            array1[a] = random1.nextInt(50, 65);
            System.out.print(array1[a] + " ");
            ++a;
        }


        System.out.println();

        int[] array2 = new int[40];

        Random random2 = new Random();
        int b = 0;
        do {
            array2[b] = random2.nextInt(25, 40);
            System.out.print(array2[b] + " ");
            b++;
        } while (b < 40);


    }
}





