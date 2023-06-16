package homeworks.anton_gvozdenko.hw_06_05_23.Car;

interface Valuable {
    int revaluePrice(int maxSpeed);

    int reloadModel(int maxSpeed);

    void showInfo();
}

public class Car implements Valuable {
    private String name;
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int revaluePrice(int maxSpeed) {
     int price =  maxSpeed * 100;
     return price;
    }

    @Override
    public int reloadModel(int maxSpeed) {
        int speed  = maxSpeed + 10;
return speed;
    }

    @Override
    public void showInfo() {
        System.out.println("Name = " + name + "\tSpeed = " + maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


}

class LuxCar extends Car {
    public LuxCar(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public int revaluePrice(int maxSpeed) {

       int price = maxSpeed * 250;
       return price;
    }

    @Override
    public int reloadModel(int maxSpeed) {
        int speed = maxSpeed + 5;
return speed;
    }

}


class Test {
    public static void main(String[] args) {
        Car car = new Car("ZAZ", 140);
        LuxCar lux = new LuxCar("BMW", 160);

        lux.reloadModel(160);
        car.reloadModel(140);
      lux.reloadModel(160);
      lux.revaluePrice(140);
        car.showInfo();
        lux.showInfo();

    }

}



