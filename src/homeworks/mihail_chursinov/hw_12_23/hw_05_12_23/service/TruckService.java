package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Truck;

import java.sql.SQLException;
import java.util.List;

public interface TruckService extends CrudService<Truck> {

    List<Truck> findAllByDriverId(int driverId) throws SQLException;
}
