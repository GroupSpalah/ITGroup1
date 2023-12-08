package homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.Notebook;
import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.dao.NotebookDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.service.NotebookService;

import java.sql.SQLException;

public class NotebookServiceImpl implements NotebookService {
    private NotebookDAO dao;

    public NotebookServiceImpl() {
        dao = new NotebookDAOImpl();
    }

    @Override
    public void add(Notebook notebook) throws SQLException {
        dao.add(notebook);

    }

    @Override
    public void showForID(int id) throws SQLException {
        dao.showForID(id);

    }

    @Override
    public void showAll() throws SQLException {
        dao.showAll();

    }

    @Override
    public void deleteForID(int id) throws SQLException {
        dao.showForID(id);

    }

    @Override
    public void deleteAll() throws SQLException {
        dao.deleteAll();

    }

    @Override
    public void updateForId(Notebook notebook) throws SQLException {
        dao.updateForId(notebook);

    }

    @Override
    public void showForModel(String model) throws SQLException {
        dao.showForModel(model);

    }

    @Override
    public void showForDate(String date) throws SQLException {
        dao.showForDate(date);

    }

    @Override
    public void showForRamAndSsd(int ram, int ssd) throws SQLException {
        dao.showForRamAndSsd(ram, ssd);

    }

    @Override
    public void showForCpu(String cpu) throws SQLException {
        dao.showForCpu(cpu );

    }
}
