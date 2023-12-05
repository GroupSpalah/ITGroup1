package homeworks.anton_gvozdenko.hw_01_12_23.service;

import java.sql.SQLException;

public interface NotebookService {
    public void showAllAddresses() throws SQLException;
    public void showByID(int id) throws SQLException;
}
