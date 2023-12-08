package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Driver;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Truck;

import java.sql.SQLException;

public interface TruckService extends ServiceDAO<Truck>{

    void findByID(int id) throws SQLException;
}
