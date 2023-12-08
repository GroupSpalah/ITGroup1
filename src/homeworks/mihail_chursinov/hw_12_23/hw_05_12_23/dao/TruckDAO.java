package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Truck;

import java.sql.SQLException;

public interface TruckDAO extends CrudDAO<Truck> {
    void findByID(int id) throws SQLException;
}
