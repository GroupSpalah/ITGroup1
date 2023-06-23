package homeworks.mihail_chursinov.hw_05_23.hw_23_05_23.task2;

public class Buses extends Vehicles {
    public Buses(String name, int age, Fuel fuel) {
        super(name, age, fuel);
    }

    @Override
    public void amountWheels() {
        System.out.println("The car has 12 wheels");
    }

    @Override
    public void refuel(Fuel fuel) {
        if (fuel == Fuel.GASOLINE) {
            System.out.println("The bus is in good condition!");
        } else {
            System.out.println("The bus is defective!");
        }

    }
}

