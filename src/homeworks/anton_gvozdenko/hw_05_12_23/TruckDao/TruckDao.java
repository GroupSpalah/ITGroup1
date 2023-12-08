package homeworks.anton_gvozdenko.hw_05_12_23.TruckDao;

import homeworks.anton_gvozdenko.hw_05_12_23.Truck;

import java.sql.SQLException;

public interface TruckDao {
    public void showAllTrucks() throws SQLException;

    public void delete() throws SQLException;

    public void insert(Truck truck) throws SQLException;
}
