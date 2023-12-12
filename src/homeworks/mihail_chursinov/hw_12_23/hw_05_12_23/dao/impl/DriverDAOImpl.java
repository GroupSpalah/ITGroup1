package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Driver;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Truck;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.CrudDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.dao.TruckDAO;
import homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.domain.Qualification;

import static homeworks.mihail_chursinov.hw_12_23.hw_05_12_23.util.ConnectionUtil.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DriverDAOImpl implements CrudDAO<Driver> {
    private TruckDAO truckDAO;


    public DriverDAOImpl() {
        truckDAO = new TruckDAOImpl();
    }

    @Override
    public Driver findById(int id) throws SQLException {
        return null;
    }

    @Override
    public void create(Driver driver) throws SQLException {
        String query = "INSERT INTO driver(first_name, last_name, age, qualification) " +
                "VALUES(?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, driver.firstName());
            statement.setString(2, driver.lastName());
            statement.setInt(3, driver.age());
            statement.setString(4, driver.qualification().name());

            statement.executeUpdate();
        }
    }

    @Override
    public void showAll() throws SQLException {
        String query = "SELECT * FROM driver";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            List<Driver> drivers = new ArrayList<>();

            while (resultSet.next()) {
                int driverId = resultSet.getInt("id_driver");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                Qualification qualification = Qualification.valueOf(resultSet.getString("qualification"));
                List<Truck> trucks = truckDAO.findAllByDriverId(driverId);

                Driver driver = new Driver(driverId, firstName, lastName, age, qualification, trucks);

                drivers.add(driver);

            }
            drivers.forEach(System.out::println);
        }

    }

    @Override
    public void update(Driver driver) throws SQLException {
        String query = "UPDATE driver SET first_name = ?, last_name = ?, age = ?, " +
                "qualification = ? WHERE id_driver = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, driver.firstName());
            statement.setString(2, driver.lastName());
            statement.setInt(3, driver.age());
            statement.setString(4, driver.qualification().name());

            statement.executeUpdate();

        }

    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM driver WHERE id_driver = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            statement.executeUpdate();

        }
    }

}
