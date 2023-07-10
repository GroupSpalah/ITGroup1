package lessons.ls_04_23.ls_15_04_23.inject_mocks;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void action() {
        int numberCylindres = engine.getNumberCylindres();//8
        System.out.println(numberCylindres);
    }
}
