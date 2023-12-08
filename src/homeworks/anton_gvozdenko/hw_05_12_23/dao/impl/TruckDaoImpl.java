package homeworks.anton_gvozdenko.hw_05_12_23.dao.impl;

import homeworks.anton_gvozdenko.hw_05_12_23.domain.Truck;
import homeworks.anton_gvozdenko.hw_05_12_23.dao.TruckDao;

import java.sql.*;
import java.util.Objects;

import static homeworks.anton_gvozdenko.hw_05_12_23.util.Constans.*;

public class TruckDaoImpl implements TruckDao {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        return connection;
    }

    public void showAllTrucks() throws SQLException {
        String query = "SELECT * FROM Truck";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String model = resultSet.getString("model");
                String year = resultSet.getString("model_year");
                int FKDriverTruck = resultSet.getInt("FK_truck_driver");

                System.out.println(model + " " + year + " " + FKDriverTruck);

            }

        }
    }

    public void delete() throws SQLException {

        String query = "DELETE FROM Driver";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.executeUpdate();
        }
    }

    public void insert(Truck truck) throws SQLException {

        String query = "INSERT INTO Truck(model, model_year,FK_truck_driver) " +
                "VALUES(?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, truck.getModel());
            statement.setString(2, truck.getDate());
            statement.setInt(3, truck.getId());
            statement.executeUpdate();
        }
    }
}


