package homeworks.anton_gvozdenko.hw_01_12_23.dao;

import java.sql.SQLException;

public interface NotebookDAO {
    public void showAllAddresses() throws SQLException;
    public void showByID(int id) throws SQLException;
}
