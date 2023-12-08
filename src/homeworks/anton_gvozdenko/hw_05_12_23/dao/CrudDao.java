package homeworks.anton_gvozdenko.hw_05_12_23.dao;

import java.sql.Driver;
import java.sql.SQLException;

public interface CrudDao<T> {
    public void showAll() throws SQLException;
    public  void delete() throws SQLException;
    public void insert(T t) throws SQLException;

}
