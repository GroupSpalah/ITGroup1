package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import java.time.LocalDate;

public class Tram extends Vehicle {
    private int yearsInService;

    public Tram(int id, int number, int licensePlate, int maximumNumberPassengers, Status status, Fuel fuel,
                LocalDate dateService, Station station, int yearsInService) {
        super(id, number, licensePlate, maximumNumberPassengers, status, fuel, dateService, station);
        this.yearsInService = yearsInService;
    }

    public int getYearsInService() {
        return yearsInService;
    }
}
