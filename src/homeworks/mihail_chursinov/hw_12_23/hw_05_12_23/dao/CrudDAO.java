package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Driver;

import java.sql.SQLException;

public interface CrudDAO<T> {
    void create(T t) throws SQLException;
    void read() throws SQLException;
    void update(T t) throws SQLException;
    void delete(int id) throws SQLException;
}
