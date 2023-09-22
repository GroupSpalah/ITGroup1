package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        VehicleService service = new VehicleService();
        Vehicle vehicle = new Vehicle(1, 111, 30,
                VehicleStatus.IN_OPERATION, FuelType.GAS,
                LocalDate.of(2023, 2, 3));
        Bus bus = new Bus(2, 222, 20, VehicleStatus.IN_OPERATION, FuelType.GAS, LocalDate.of(2023,
                5, 15), 5
        );
        TrolleyBus trolleyBus = new TrolleyBus(3, 333, 15, VehicleStatus.NEED_RENOVATION
                , FuelType.HYBRID, LocalDate.of(2023, 6, 10));
        Tram tram = new Tram(4, 444, 10, VehicleStatus.NEED_RENOVATION, FuelType.ELECTRIC,
                LocalDate.of(2023, 1, 1), 5);
        Station station = new Station("Istorychna");
        Route route = new Route();
        route.assignVehicle(bus);

        service.checkStatus();
        service.checkSpecialStatus();

//        vehicle.addVehicle(vehicle);

    }
}

class A {
    public A() {
        new B();
    }
}

class B {
    public B() {
        new A();
    }
}
