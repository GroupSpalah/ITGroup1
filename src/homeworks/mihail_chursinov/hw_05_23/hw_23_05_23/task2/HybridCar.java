package homeworks.mihail_chursinov.hw_05_23.hw_23_05_23.task2;

public class HybridCar extends Car{
    public HybridCar(String name, int age, Fuel fuel, Fuel fuel1) {
        super(name, age, fuel, fuel1);
    }

    public void refuel(Fuel fuel, Fuel fuel1) {
        if (fuel == Fuel.ELECTRICITY || fuel == Fuel.GASOLINE) {
            System.out.println("The hybrid car runs on gasoline. But could also be charged by electricity!");
        } else {
            System.out.println("The hybrid car is defective!");
        }
    }
}
