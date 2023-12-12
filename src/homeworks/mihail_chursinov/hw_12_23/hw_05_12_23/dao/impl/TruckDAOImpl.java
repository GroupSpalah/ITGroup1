package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Truck;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.TruckDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.util.ConnectionUtil.*;

public class TruckDAOImpl implements TruckDAO {

    @Override
    public void create(Truck truck) {

    }

    @Override
    public void showAll() {

    }

    @Override
    public void update(Truck truck) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Truck findById(int id) throws SQLException {
        String query = "SELECT * FROM Truck WHERE FK_Truck_Driver = id_driver";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idTruck = resultSet.getInt("id_truck");
                    String model = resultSet.getString("model");
                    int modelYear = resultSet.getInt("model_year");

                    return new Truck(idTruck, model, modelYear);
                }
            }

            return null;
        }
    }

    @Override
    public List<Truck> findAllByDriverId(int driverId) throws SQLException {
        List<Truck> trucks = new ArrayList<>();
        String query = "SELECT * FROM truck WHERE FK_Truck_Driver = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, driverId);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int truckId = resultSet.getInt("id_truck");
                    String model = resultSet.getString("model");
                    int modelYear = resultSet.getInt("model_year");

                    Truck truck = new Truck(truckId, model, modelYear);
                    trucks.add(truck);
                }
            }
        }

        return trucks;
    }
}
