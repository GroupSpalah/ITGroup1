package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;

public class Bus extends Vehicle {
    private int idOfPollution;

    public Bus(int id, int vehicleNumber, int maxPassengers, VehicleStatus vehicleStatus,
               FuelType fuelType, LocalDate dateOfService, int idOfPollution) {
        super(id, vehicleNumber, maxPassengers, vehicleStatus, fuelType, dateOfService);
        this.idOfPollution = idOfPollution;
    }

    public int getIdOfPollution() {
        return idOfPollution;
    }

}



