package lessons.ls_04_02_23.one_dim_array;

import java.util.Random;

public class OneDimArray {
    public static void main(String[] args) {
        //datatype name = new datatype[size];

        int[] array = new int[5];//0 0 0 0 0

        /*array[0] = 5;
        array[1] = 8;
        array[2] = 9;
        array[3] = 1;
        array[4] = 2;*/

//        System.out.println(array[1]);

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(20);//0-19
            System.out.print(array[i] + "\t");
        }
    }
}
