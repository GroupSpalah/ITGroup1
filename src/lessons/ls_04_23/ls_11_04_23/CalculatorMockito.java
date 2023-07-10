package lessons.ls_04_23.ls_11_04_23;

import java.util.Random;

public class CalculatorMockito {

    public int sum(int a) {
        int randomValue = this.getRandom();
        return a + randomValue;
    }

    public int getRandom() {
        Random random = new Random();
        int randomValue = random.nextInt(20);//0-19
        return randomValue;
    }
}
