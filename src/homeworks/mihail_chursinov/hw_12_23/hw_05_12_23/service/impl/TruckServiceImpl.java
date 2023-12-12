package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Truck;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.TruckDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.impl.TruckDAOImpl;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.TruckService;

import java.sql.SQLException;
import java.util.List;

public class TruckServiceImpl implements TruckService {
    private TruckDAO dao;

    public TruckServiceImpl() {
        dao = new TruckDAOImpl();

    }

    @Override
    public void create(Truck truck) throws SQLException {
        dao.create(truck);

    }

    @Override
    public void showAll() throws SQLException {

    }


    @Override
    public void update(Truck truck) throws SQLException {
        dao.update(truck);

    }

    @Override
    public void delete(int id) throws SQLException {
        dao.delete(id);

    }

    @Override
    public Truck findById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Truck> findAllByDriverId(int driverId) throws SQLException {
        return null;
    }
}
