package lessons.inheritance.ls_29_04_23.vehicle;

public class Lorry extends Car {
    private float lorryWeigth;

    public Lorry(String model, float weight, Driver driver, Engine engine, float lorryWeigth) {
        super(model, weight, driver, engine);
        this.lorryWeigth = lorryWeigth;
    }
}
