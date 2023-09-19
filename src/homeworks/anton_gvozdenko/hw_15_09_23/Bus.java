package homeworks.anton_gvozdenko.hw_15_09_23;

import java.time.LocalDate;
import java.util.List;


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
    List<Bus> buses;

   /* public void   checkStatus(List<Bus> buses){

        buses
                .stream()
                .filter(bus -> bus.getDateOfService().isBefore(LocalDate.now().minusMonths(6)) &&
                        bus.idOfPollution > 5)
                .forEach( bus -> bus.getVehicleStatus() == VehicleStatus.IN_OPERATION).
*/
    }


