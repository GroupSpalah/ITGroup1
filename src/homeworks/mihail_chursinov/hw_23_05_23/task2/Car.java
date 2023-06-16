package homeworks.mihail_chursinov.hw_23_05_23.task2;

public class Car extends Vehicles {

    private Fuel fuel1;

    public Car(String name, int age, Fuel fuel, Fuel fuel1) {
        super(name, age, fuel);
        this.fuel1 = fuel1;
    }
    public Car(String name, int age, Fuel fuel) {
        super(name, age, fuel);
    }

    @Override
    public void amountWheels() {
        System.out.println("The car has 4 wheels");
    }

    @Override
    public void refuel(Fuel fuel) {
        if (fuel == Fuel.ELECTRICITY) {
            System.out.println("The car is in good condition!");
        } else {
            System.out.println("The car is defective!");
        }
    }
}
