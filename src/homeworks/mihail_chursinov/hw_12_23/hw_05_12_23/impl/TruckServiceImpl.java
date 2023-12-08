package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Truck;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.TruckDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.ServiceDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service.TruckService;

import java.sql.SQLException;

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
    public void read() throws SQLException {
        dao.read();

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
    public void findByID(int id) throws SQLException {
        dao.findByID(id);

    }
}
