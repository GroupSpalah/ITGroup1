package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Driver;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.CrudDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.ServiceDAO;

import java.sql.SQLException;

public class DriverServiceImpl implements ServiceDAO<Driver> {
    private CrudDAO<Driver> dao;

    public DriverServiceImpl() {
        dao = new DriverDAOImpl();
    }

    @Override
    public void create(Driver driver) throws SQLException {
        dao.create(driver);

    }

    @Override
    public void read() throws SQLException {
        dao.read();

    }

    @Override
    public void update(Driver driver) throws SQLException {
        dao.update(driver);

    }

    @Override
    public void delete(int id) throws SQLException {
        dao.delete(id);

    }
}
