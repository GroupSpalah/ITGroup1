package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.Truck;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.TruckDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.util.ConnectionUtil.*;

public class TruckDAOImpl implements TruckDAO {

    @Override
    public void create(Truck truck) {

    }

    @Override
    public void read() {

    }

    @Override
    public void update(Truck truck) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void findByID(int id) throws SQLException {
        String query = "SELECT * FROM Truck WHERE FK_Truck_Driver = id_driver";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idTruck = resultSet.getInt("id_truck");
                    String model = resultSet.getString("model");
                    int modelYear = resultSet.getInt("model_year");

                    System.out.println("Truck ID: " + idTruck);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + modelYear);
                }
            }
        }
    }
}
