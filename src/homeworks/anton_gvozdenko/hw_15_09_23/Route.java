package homeworks.anton_gvozdenko.hw_15_09_23;

import java.util.ArrayList;
import java.util.List;

public class Route {
    List<Vehicle> vehicles;
    List<Station> stations;

    public Route(List<Station> stations) {
        this.vehicles = new ArrayList<>();
        this.stations = stations;
    }

    public void assignVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleStatus() == VehicleStatus.IN_OPERATION) {
            vehicles.add(vehicle);
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


