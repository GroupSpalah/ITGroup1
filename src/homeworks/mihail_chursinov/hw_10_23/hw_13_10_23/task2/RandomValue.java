package homeworks.mihail_chursinov.hw_10_23.hw_13_10_23.task2;

import java.util.Random;

public class RandomValue extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        int randomValue = random.nextInt(10, 100);
        System.out.println(randomValue);
    }
}
