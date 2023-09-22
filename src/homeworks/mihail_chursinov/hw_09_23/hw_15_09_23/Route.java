package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import java.util.List;

public class Route{
    private List<Vehicle> vehicles;
    private Station station;

    public Route(List<Vehicle> vehicles, Station station) {
        this.vehicles = vehicles;
        this.station = station;
    }

    public Station getStation() {
        return station;
    }
}
