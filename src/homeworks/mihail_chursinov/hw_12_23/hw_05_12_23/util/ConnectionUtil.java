package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
    private static BasicDataSource ds = new BasicDataSource();

    static {
        ds.setUrl("jdbc:mysql://localhost:3306/driver?serverTimezone=Europe/Kiev");
        ds.setUsername("root");
        ds.setUrl("123456");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setMinIdle(5);
        ds.setMinIdle(10);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
