package homeworks.mihail_chursinov.hw_10_23.hw_10_10_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {
    private List<Connection> availableConnections = new ArrayList<>();
    private List<Connection> usedConnections = new ArrayList<>();
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public DatabaseConnectionPool(int initialPoolSize) {
        for (int i = 0; i < initialPoolSize; i++) {
            availableConnections.add(createConnection());
        }
    }

    public Connection getConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("No available connections. Creating a new one.");
            Connection newConnection = createConnection();
            usedConnections.add(newConnection);
            return newConnection;
        } else {
            Connection existingConnection = availableConnections.remove(availableConnections.size() - 1);
            usedConnections.add(existingConnection);
            return existingConnection;
        }
    }

    public void releaseConnection(Connection connection) {
        if (usedConnections.remove(connection)) {
            availableConnections.add(connection);
        }
    }

    private Connection createConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        DatabaseConnectionPool connectionPool = new DatabaseConnectionPool(10);

        //Используем соединение из пула
        Connection connection1 = connectionPool.getConnection();
        // Код для использования соединения connection1

        // Возвращаем соединение обратно в пул
        connectionPool.releaseConnection(connection1);

    }
}

