package homeworks.mihail_chursinov.hw_23_05_23.task2;

import java.util.Objects;

/**
 * Please model in classes domain described below.
 * Using of interfaces, abstract classes & inheritances & abstract methods are highly recommended.
 * <p>
 * Vehicles. There are different kind of vehicles - cars, trucks, c.
 * Cars could be different kind as well - suv, racing car, compact car.
 * <p>
 * Vehicle runs on some fuel - gasoline, diesel, electricity.
 * Its possible to fuel vehicle. If wrong fuel is used - car should break. (message)
 * All vehicles can do some actions: like accelerate or brake.
 * <p>
 * Each and every vehicle has wheels. But trucks & buses has more wheels than cars.
 * It should be possible to request number of wheels from car.
 * <p>
 * P.S. BONUS - for implementing plug-in hybrid car: it runs on gasoline. But could also be charged by electricity.
 */

public abstract class Vehicles {
    private String name;
    private int age;
    private Fuel fuel;

    public Vehicles(String name, int age, Fuel fuel) {
        this.name = name;
        this.age = age;
        this.fuel = fuel;
    }

    public void amountWheels() {
        System.out.println("Number of wheels");
    }

    public void refuel(Fuel fuel) {
        if (fuel == Fuel.ELECTRICITY || fuel == Fuel.DIESEL || fuel == Fuel.GASOLINE) {
            System.out.println("The vehicle is in good condition!");
        } else {
            System.out.println("The vehicle is defective!");
        }

    }
}
