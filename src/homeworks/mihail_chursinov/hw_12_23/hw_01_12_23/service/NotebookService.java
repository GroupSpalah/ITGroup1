package homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.service;

import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.Notebook;

import java.sql.SQLException;

public interface NotebookService {
    public void add(Notebook notebook) throws SQLException;
    public void showForID(int id) throws SQLException;
    public void showAll() throws SQLException;
    public void deleteForID(int id) throws SQLException;
    public void deleteAll() throws SQLException;
    public void updateForId(Notebook notebook) throws SQLException;
    public void showForModel(String model) throws SQLException;
    public void showForDate(String date) throws SQLException;
    public void showForRamAndSsd(int ram, int ssd) throws SQLException;
    public void showForCpu(String cpu) throws SQLException;
}
