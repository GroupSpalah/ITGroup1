package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;

public class Tram extends Vehicle{
    private int countYear;

    public Tram(int id, int vehicleNumber, int maxPassengers, VehicleStatus vehicleStatus,
                FuelType fuelType, LocalDate dateOfService, int countYear) {
        super(id, vehicleNumber, maxPassengers, vehicleStatus, fuelType, dateOfService);
        this.countYear = countYear;
    }

    public int getCountYear() {
        return countYear;
    }
}
