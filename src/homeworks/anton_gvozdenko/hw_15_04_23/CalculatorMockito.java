package homeworks.anton_gvozdenko.hw_15_04_23;

import java.util.Random;

public class CalculatorMockito {

    public int getOperandOne() {
        return new Random().nextInt(50);
    }

    public int getOperandTwo() {
        return new Random().nextInt(50);
    }

    public int getSum() {
        return getOperandOne() + getOperandTwo();
    }

    public int getMinus() {
        return getOperandOne() - getOperandTwo();
    }

    public int getMultiply() {
        return getOperandOne() * getOperandTwo();
    }

    public int getDivide() {
        return getOperandOne() / getOperandTwo();
    }

    public int getRemainder() {
        return (getOperandOne() - (getOperandOne() / getOperandTwo()) * getOperandTwo());
    }

}


