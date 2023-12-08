package homeworks.anton_gvozdenko.hw_05_12_23.dao;

import homeworks.anton_gvozdenko.hw_05_12_23.domain.Truck;

import java.sql.SQLException;
import java.util.List;

public interface TruckDao extends CrudDao<Truck> {
  List<Truck> findAllTrucksByDriverId(int driverId);
}
