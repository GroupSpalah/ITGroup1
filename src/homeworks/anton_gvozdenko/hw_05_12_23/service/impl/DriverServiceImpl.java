package homeworks.anton_gvozdenko.hw_05_12_23.service.impl;

import homeworks.anton_gvozdenko.hw_05_12_23.dao.CrudDao;
import homeworks.anton_gvozdenko.hw_05_12_23.dao.impl.DriverDaoImpl;
import homeworks.anton_gvozdenko.hw_05_12_23.service.DriverService;

import java.sql.Driver;
import java.sql.SQLException;

public class DriverServiceImpl implements DriverService {
    private CrudDao driverDao;

    public DriverServiceImpl() {
        driverDao = new DriverDaoImpl();

    }

    @Override
    public void showAllDrivers() throws SQLException {

    }

    @Override
    public void delete() throws SQLException {

    }

    @Override
    public void insert(Driver driver) throws SQLException {

    }
}
