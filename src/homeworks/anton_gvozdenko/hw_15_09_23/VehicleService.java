package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    private List<Bus> buses;
    private List<Vehicle> vehicles;

    public VehicleService() {
        this.buses = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }


    public void  addService(VehicleService service){
    service.addService(service);
}
    public void checkStatus() {

        buses
                .stream()
                .filter(bus -> bus.getDateOfService().isBefore(LocalDate.now().minusMonths(6)) &&
                        bus.getIdOfPollution() > 5)
                .forEach(bus -> bus.setVehicleStatus(VehicleStatus.IN_OPERATION));
        buses.stream()
                .filter(bus -> bus.getDateOfService().isBefore(LocalDate.now().minusMonths(12)) &&
                        bus.getIdOfPollution() >= 3 && bus.getIdOfPollution() < 5)
                .forEach(bus -> bus.setVehicleStatus(VehicleStatus.NEED_RENOVATION));
        buses
                .stream()
                .filter(bus -> bus.getDateOfService().isAfter(LocalDate.now().minusMonths(12)) &&
                        bus.getIdOfPollution() < 3)
                .forEach(bus -> bus.setVehicleStatus(VehicleStatus.SCRAP));
    }
    public int checkSpecialStatus() {
        long count1 = vehicles
                .stream()
                .filter(vehicle -> vehicle.getVehicleStatus() == VehicleStatus.SCRAP)
                .count();
        return 0;
    }
}