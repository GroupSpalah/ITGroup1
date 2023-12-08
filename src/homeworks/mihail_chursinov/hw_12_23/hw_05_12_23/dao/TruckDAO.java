package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Truck;

import java.util.List;

public interface TruckDAO extends CrudDAO<Truck> {
    List<Truck> findAllByDriverId(int driverId);
}
