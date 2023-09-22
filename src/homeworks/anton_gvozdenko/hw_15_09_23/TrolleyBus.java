package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;

public class TrolleyBus  extends Vehicle{
    public TrolleyBus(int id, int vehicleNumber, int maxPassengers, VehicleStatus vehicleStatus,
                      FuelType fuelType, LocalDate dateOfService) {
        super(id, vehicleNumber, maxPassengers, vehicleStatus, fuelType, dateOfService);
    }
public void addTrolley(TrolleyBus trolleyBus){
        trolleyBus.addTrolley(trolleyBus);
}
}
