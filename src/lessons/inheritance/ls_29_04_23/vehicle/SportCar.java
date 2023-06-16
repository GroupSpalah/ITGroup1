package lessons.inheritance.ls_29_04_23.vehicle;

public class SportCar extends Car {
    private int speed;

    public SportCar(String model, float weight, Driver driver, Engine engine, int speed) {
        super(model, weight, driver, engine);
        this.speed = speed;
    }
}
