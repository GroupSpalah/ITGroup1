package homeworks.anton_gvozdenko.hw_04_03_23;

public class CalculatorWithFields {
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

    public float minus() {
        return valueOne - valueTwo;
    }

    public float multiply() {
        return valueOne * valueTwo;
    }

    public float divide() {
        return valueOne / valueTwo;
    }

}

class TestCalculatorWithF {
    public static void main(String[] args) {
        CalculatorWithFields calculator = new CalculatorWithFields(4, 5);
        float resultSum = calculator.sum();
        System.out.println("Addition = " + resultSum);
        calculator.setValueOne(8);
        calculator.setValueTwo(12);
        float resultMinus = calculator.minus();
        System.out.println("Subtraction = " + resultMinus);
        calculator.setValueOne(15);
        calculator.setValueTwo(10);
        float resultMultiply = calculator.multiply();
        System.out.println("Multiplication = " + resultMultiply);
        calculator.setValueOne(18);
        calculator.setValueTwo(3);
        float resultDivide = calculator.divide();
        System.out.println("Division = " + resultDivide);
    }
}


