package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import homeworks.anton_gvozdenko.hw_15_09_23.VehicleStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleService {
    private List<Vehicle> vehicles;
    private List<Bus> buses;
    private List<Route> routes;

    public VehicleService() {
        this.vehicles = new ArrayList<>();
        this.buses = new ArrayList<>();
        this.routes = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public void checkStatus() {
        buses
                .stream()
                .filter(bus -> bus.getDateService().isBefore(LocalDate.now().minusMonths(6)) &&
                        bus.getDirtyIndicator() > 5)
                .forEach(bus -> bus.setStatus(Status.IN_OPERATION));
        buses
                .stream()
                .filter(bus -> bus.getDateService().isBefore(LocalDate.now().minusMonths(12)) &&
                        bus.getDirtyIndicator() >= 3 && bus.getDirtyIndicator() <= 5)
                .forEach(bus -> bus.setStatus(Status.NEED_RENOVATION));
    }

    private long countVehiclesWithSpecialStatus(Status status) {
        return vehicles
                .stream()
                .filter(v -> v.getStatus() == status)
                .count();
    }

    /**
     * Маршрут описывается двумя или более станциями,
     *  * и список транспортных средств, которые на нем работают. Помните, что маршрут может быть назначен
     *  * только транспортным средствам, находящимся в эксплуатации.
     *  * Каждая станция имеет название.
     *  */

//    public void checkTracking() {
//
//        routes.
//                forEach(route -> {
//            List<Vehicle> vehiclesForAssignment = vehicles
//                    .stream()
//                    .filter(vehicle -> vehicle.getStatus() == Status.IN_OPERATION)
//                    .toList()
//
//            });
//
//
//    }
}
