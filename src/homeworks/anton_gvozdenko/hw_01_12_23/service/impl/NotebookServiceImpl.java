package homeworks.anton_gvozdenko.hw_01_12_23.service.impl;

import homeworks.anton_gvozdenko.hw_01_12_23.dao.NotebookDAO;
import homeworks.anton_gvozdenko.hw_01_12_23.dao.impl.NotebookDAOImpl;
import homeworks.anton_gvozdenko.hw_01_12_23.service.NotebookService;

import java.sql.SQLException;

public class NotebookServiceImpl implements NotebookService {
    private NotebookDAO dao;

    public NotebookServiceImpl() {
        dao = new NotebookDAOImpl();
    }

    @Override
    public void showAllAddresses() throws SQLException {
        dao.showAllAddresses();
    }

    @Override
    public void showByID(int id) throws SQLException {
        dao.showByID(id);
    }
}
