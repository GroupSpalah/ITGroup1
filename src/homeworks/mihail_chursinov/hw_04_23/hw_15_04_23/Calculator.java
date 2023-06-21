package homeworks.mihail_chursinov.hw_04_23.hw_15_04_23;

import java.util.Random;

public class Calculator {
    /**
     * 1) Создать калькулятор:
     * Метод класса возвращает значение для операции. Создать методы под действия *, /, -, +, %.
     * Создать два public метода, возвращающих случайные числа.
     * Каждый метод класса вызывает один из методов(возвращают случайные числа),
     * чтобы получить значения для операций.
     * Протестировать методы, выполняющие мат. действия. Для каждой операции в тесте
     * возвращать разные значения используя Mockito(mock and spy).
     * <p>
     * class Calculator {
     * <p>
     * public int getOperandOne() {
     * return new Random().nextInt(50);
     * }
     * <p>
     * public int getOperandTwo() {
     * return new Random().nextInt(50);
     * }
     * <p>
     * public int sum() {//5, 7
     * return getOperandOne() + getOperandTwo();
     * }
     * <p>
     * public int minus() {//12, 5
     * return getOperandOne() - getOperandTwo();
     * }
     * }
     */
    public int getOperandOne() {
        Random random = new Random();
        int valueRandom = random.nextInt(50);
        return valueRandom;
    }

    public int getOperandTwo() {
        Random random = new Random();
        int valueRandom = random.nextInt(50);
        return valueRandom;
    }

    public int sum() {
        return getOperandOne() + getOperandTwo();
    }

    public int minus() {
        return getOperandOne() - getOperandTwo();
    }

    public int multiplication() {
        return getOperandOne() * getOperandTwo();
    }

    public int divide() {
        return getOperandOne() / getOperandTwo();
    }

    public int divisionWithoutRemainder() {
        return getOperandOne() % getOperandTwo();
    }
}
