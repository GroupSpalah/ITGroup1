package lessons.ls_04_03_23;

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
//        this.valueOne =valueOne + valueTwo;
        return valueOne + valueTwo;
    }
}

class TestCalculatorWithF {
    public static void main(String[] args) {
        CalculatorWithFields calculator = new CalculatorWithFields(4, 5);

        float resultSum = calculator.sum();

        System.out.println(resultSum);

        calculator.setValueOne(8);
        calculator.setValueTwo(12);

        //call minus method
    }
}
