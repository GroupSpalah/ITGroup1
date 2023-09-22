package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import java.time.LocalDate;

public class Trolleybus extends Vehicle {
    private boolean hasElectricEngine;
    private boolean hasGasEngine;

    public Trolleybus(int id, int number, int licensePlate, int maximumNumberPassengers, Status status, Fuel fuel,
                      LocalDate dateService, Station station, boolean hasElectricEngine, boolean hasGasEngine) {
        super(id, number, licensePlate, maximumNumberPassengers, status, fuel, dateService, station);
        this.hasElectricEngine = hasElectricEngine;
        this.hasGasEngine = hasGasEngine;
    }
}
