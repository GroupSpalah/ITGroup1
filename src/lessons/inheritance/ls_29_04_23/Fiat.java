package lessons.inheritance.ls_29_04_23;

interface Drivable {
    void drive();
}

class Car implements Drivable {//parent class or super class
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void drive() {
        System.out.println("Car");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Fiat extends Car {//subclass or child, потомок
    private String fiatModel;

    public Fiat(String name, int age, String fiatModel) {
        super(name, age);
        this.fiatModel = fiatModel;
    }

    public String getFiatModel() {
        return fiatModel;
    }
}

class Mercedes extends Car {// is-a
    private String mercedesModel;

    public Mercedes(String name, int age, String mercedesModel) {
        super(name, age);
        this.mercedesModel = mercedesModel;
    }
}

class TestInheritance {
    public static void main(String[] args) {
//       Drivable implements <- Car -> Fiat extends Car
        Drivable fiat = new Fiat("Fiat", 10, "X5");

//        fiat.
    }
}
