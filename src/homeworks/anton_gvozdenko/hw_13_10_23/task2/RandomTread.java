package homeworks.anton_gvozdenko.hw_13_10_23.task2;

import java.util.Random;

public class RandomTread extends Thread {

    @Override
    public void run() {
        Random random = new Random();
        int randomValue = random.nextInt(10, 90);
        System.out.println("Random Value: " + randomValue);

    }
}


