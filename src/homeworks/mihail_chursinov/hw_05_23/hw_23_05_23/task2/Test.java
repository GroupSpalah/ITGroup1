package homeworks.mihail_chursinov.hw_05_23.hw_23_05_23.task2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Fiat", 20, Fuel.ELECTRICITY);
        Trucks trucks = new Trucks("Mercedes", 25, Fuel.DIESEL);
        Buses buses = new Buses("Volvo", 15, Fuel.GASOLINE);
        HybridCar hybridCar = new HybridCar("Toyota", 5,Fuel.ELECTRICITY, Fuel.GASOLINE);

        car.amountWheels();
        trucks.amountWheels();
        buses.amountWheels();

        car.refuel(Fuel.ELECTRICITY);
        buses.refuel(Fuel.DIESEL);

        hybridCar.refuel(Fuel.GASOLINE, Fuel.ELECTRICITY);


    }

}
