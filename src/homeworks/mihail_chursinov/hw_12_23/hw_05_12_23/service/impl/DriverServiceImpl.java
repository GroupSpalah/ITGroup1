package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Driver;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.CrudDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.impl.DriverDAOImpl;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.CrudService;
import lombok.SneakyThrows;

import java.sql.SQLException;

public class DriverServiceImpl implements CrudService<Driver> {
    private CrudDAO<Driver> dao;

    public DriverServiceImpl() {
        dao = new DriverDAOImpl();
    }

    @Override
    public void create(Driver driver) throws SQLException {
        dao.create(driver);

    }

    @Override
    public void showAll() throws SQLException {
        dao.showAll();

    }


    @Override
    public void update(Driver driver) throws SQLException {
        dao.update(driver);
    }

    @Override
    public void delete(int id) throws SQLException {
        dao.delete(id);
    }

    @Override
    public Driver findById(int id) throws SQLException {
        return null;
    }
}
