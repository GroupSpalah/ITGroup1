package homeworks.anton_gvozdenko.hw_15_09_23;

import java.util.ArrayList;
import java.util.List;

public class Route {
    List<Vehicle> vehicles;
    List<Station> stations;

    public Route() {
        this.vehicles = new ArrayList<>();
        this.stations = new ArrayList<>();
    }

    public void assignVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleStatus() == VehicleStatus.IN_OPERATION) {
            vehicles.add(vehicle);
            System.out.println(
                    vehicle.getVehicleStatus());
        } else {
            System.out.println("Cannot assign vehicle");
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Station> getStations() {
        return stations;
    }
}


