package homeworks.anton_gvozdenko.hw_05_12_23.service.impl;

import homeworks.anton_gvozdenko.hw_05_12_23.domain.Truck;
import homeworks.anton_gvozdenko.hw_05_12_23.dao.TruckDao;
import homeworks.anton_gvozdenko.hw_05_12_23.dao.impl.TruckDaoImpl;
import homeworks.anton_gvozdenko.hw_05_12_23.service.TruckService;

import java.sql.SQLException;

public class TruckServiceImpl implements TruckService {
    private TruckDao truckDao;

    public TruckServiceImpl() {
        truckDao = new TruckDaoImpl();
    }

    @Override
    public void showAllTrucks() throws SQLException {

    }

    @Override
    public void delete() throws SQLException {

    }

    @Override
    public void insert(Truck truck) throws SQLException {

    }
}
