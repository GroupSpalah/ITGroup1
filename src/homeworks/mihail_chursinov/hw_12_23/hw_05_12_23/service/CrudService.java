package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.service;

import java.sql.SQLException;

public interface CrudService<T>{
    void create(T t) throws SQLException;
    void read() throws SQLException;
    void update(T t) throws SQLException;
    void delete(int id) throws SQLException;
}
