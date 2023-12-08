package homeworks.anton_gvozdenko.hw_05_12_23.driverService;

import homeworks.anton_gvozdenko.hw_05_12_23.DriverDao.DriverDao;
import homeworks.anton_gvozdenko.hw_05_12_23.DriverDao.DriverDaoImpl;

import java.sql.Driver;
import java.sql.SQLException;

public class DriverServiceImpl implements DriverService {
    private DriverDao driverDao;

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
