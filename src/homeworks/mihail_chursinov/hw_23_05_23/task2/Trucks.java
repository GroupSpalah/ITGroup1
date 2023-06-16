package homeworks.mihail_chursinov.hw_23_05_23.task2;

public class Trucks extends Vehicles {
    public Trucks(String name, int age, Fuel fuel) {
        super(name, age, fuel);
    }

    @Override
    public void amountWheels() {
        System.out.println("The car has 8 wheels");
    }

    @Override
    public void refuel(Fuel fuel) {
        if (fuel == Fuel.DIESEL) {
            System.out.println("The truck is in good condition!");
        } else {
            System.out.println("The truck is defective!");
        }
    }
}

