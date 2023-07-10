package lessons.ls_02_23.ls_04_02_23;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

//        int value = random.nextInt(20);//from 0 to 19
        int value = random.nextInt(10, 20);//from 10 to 19

        System.out.println(value);
    }
}
