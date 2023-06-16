package homeworks.anton_gvozdenko.hw_04_03_23;

public class CalculatorWithoutFields {

    public float sum(float numb1, float numb2) {
        return numb1 + numb2;
    }

    public float minus(float numb1, float numb2) {
        return numb1 - numb2;
    }

    public float multiply(float numb1, float numb2) {
        return numb1 * numb2;
    }

    public float divide(float numb1, float numb2) {
        return numb1 / numb2;
    }
}

class Test {
    public static void main(String[] args) {
        CalculatorWithoutFields calculator = new CalculatorWithoutFields();
        System.out.println("Sum = " + calculator.sum(10, 20));
        System.out.println("Subtraction = " + calculator.minus(50, 25));
        System.out.println("Multiplication = " + calculator.multiply(13, 5));
        System.out.println("Division = " + calculator.divide(25, 5));
    }
}