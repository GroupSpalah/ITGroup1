package homeworks.mihail_chursinov.hw_03_23.hw_04_03_23;

public class CalculatorWithFields {
    /**
     * Создать класс Калькулятор(с полями).
     * Создать методы для операций +, -, *, / над полями, возвращаюшие результат.
     * Вывести в консоль результат.
     * Перед каждым действием менять значения полей через сеттеры.
     */
    private float valueOne;
    private float valueTwo;

    public CalculatorWithFields(float valueOne, float valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public void setValueOne(float valueOne) {
        this.valueOne = valueOne;
    }

    public void setValueTwo(float valueTwo) {
        this.valueTwo = valueTwo;
    }

    public float sum() {
        return valueOne + valueTwo;
    }

    public float subtraction() {
        return valueOne - valueTwo;
    }

    public float multiplication() {
        return valueOne * valueTwo;
    }

    public float division() {
        return valueOne / valueTwo;
    }
}

class TestCalculatorWithF {
    public static void main(String[] args) {
        CalculatorWithFields calculator = new CalculatorWithFields(4, 5);

        float resultSum = calculator.sum();
        System.out.println("Result of addition = " + resultSum);

        calculator.setValueOne(12);
        calculator.setValueTwo(6);

        float resultSubtraction = calculator.subtraction();
        System.out.println("Result of subtraction  = " + resultSubtraction);

        calculator.setValueOne(2);
        calculator.setValueTwo(14);

        float resultMultiplication = calculator.multiplication();
        System.out.println("Result of multiplication = " + resultMultiplication);

        calculator.setValueOne(13);
        calculator.setValueTwo(3);

        float resultDivision = calculator.division();
        System.out.println("Result of division = " + resultDivision);


    }
}
