package homeworks.anton_gvozdenko.hw_12_09_23;


public class Dog extends Animal {

    private int digCount;

    public Dog(String id, int weight) {
        super(id, weight, "гав");
        this.digCount = 0;

    }

    public int getDigCount() {
        return digCount;
    }

    public void dig() {
        digCount++;
        if (getDigCount() > 3) {
            System.out.println("Собака не може копати");
            return;
        } else System.out.println("Собака   може копати");

    }
}




