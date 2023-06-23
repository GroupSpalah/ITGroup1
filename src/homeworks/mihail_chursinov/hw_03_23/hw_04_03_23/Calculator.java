package homeworks.mihail_chursinov.hw_03_23.hw_04_03_23;

public class Calculator {

    /**
     * Создать класс Калькулятор(без полей).
     * Создать методы для операций +, -, *, /,
     * принимающие два параметра и возвращающие результат.
     * Вывести в консоль результат.
     */

    public int sum(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public int subtraction(int valueOne, int valueTwo) {
        return valueOne - valueTwo;
    }

    public int multiplication(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }

    public int division(int valueOne, int valueTwo) {
        return valueOne / valueTwo;
    }
}

class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Result of addition = " + calculator.sum(4, 8));

        System.out.println("Result of subtraction  = " + calculator.subtraction(4, 9));

        System.out.println("Result of multiplication = " + calculator.multiplication(4, 8));

        System.out.println("Result of division = " + calculator.division(12, 6));

    }
}
