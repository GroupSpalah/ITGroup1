package homeworks.anton_gvozdenko.hw_05_12_23.TruckService;

import homeworks.anton_gvozdenko.hw_05_12_23.Truck;
import homeworks.anton_gvozdenko.hw_05_12_23.TruckDao.TruckDao;
import homeworks.anton_gvozdenko.hw_05_12_23.TruckDao.TruckDaoImpl;

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
