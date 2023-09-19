package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;

public class Vehicle {
    private  int id;
    private  int vehicleNumber;
    private int maxPassengers;
    private VehicleStatus vehicleStatus;
    private FuelType fuelType;
    private LocalDate dateOfService;

    public Vehicle(int id, int vehicleNumber, int maxPassengers, VehicleStatus vehicleStatus,
                   FuelType fuelType, LocalDate dateOfService) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.maxPassengers = maxPassengers;
        this.vehicleStatus = vehicleStatus;
        this.fuelType = fuelType;
        this.dateOfService = dateOfService;
    }

    public int getId() {
        return id;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public LocalDate getDateOfService() {
        return dateOfService;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}




