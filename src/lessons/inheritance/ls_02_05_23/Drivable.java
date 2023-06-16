package lessons.inheritance.ls_02_05_23;

import java.io.Serializable;

public interface Drivable extends Funnable, Serializable {
    void drive();
    //void fun();
}

interface Funnable {
    void fun();
}

class Driver implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driver class");
    }

    @Override
    public void fun() {
        System.out.println("It's funny");
    }
}

class TestDriver {
    public static void main(String[] args) {
        Serializable drivable = new Driver();

//        drivable.
    }
}
