package lessons.inheritance.ls_29_04_23.vehicle;

public class Car {
    private String model;
    private float weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, float weight, Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go");
    }
    public void stop() {
        System.out.println("Stop");
    }
}
