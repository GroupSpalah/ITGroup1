package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import java.time.LocalDate;

public class Bus extends Vehicle {
    private int dirtyIndicator;

    public Bus(int id, int number, int licensePlate, int maximumNumberPassengers, Status status, Fuel fuel,
               LocalDate dateService, Station station, int dirtyIndicator) {
        super(id, number, licensePlate, maximumNumberPassengers, status, fuel, dateService, station);
        this.dirtyIndicator = dirtyIndicator;
    }

    public int getDirtyIndicator() {
        return dirtyIndicator;
    }
}

