package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.impl.DriverServiceImpl;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.CrudService;

import java.sql.SQLException;

public class TestDriverTruck {
    public static void main(String[] args) throws SQLException {
        CrudService<Driver> driverService = new DriverServiceImpl();

        driverService.showAll();

    }
}
