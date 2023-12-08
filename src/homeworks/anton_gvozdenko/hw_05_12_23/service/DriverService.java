package homeworks.anton_gvozdenko.hw_05_12_23.service;

import java.sql.Driver;
import java.sql.SQLException;

public interface DriverService {
    public void showAllDrivers() throws SQLException;

    public void delete() throws SQLException;

    public void insert(Driver driver) throws SQLException;

}
