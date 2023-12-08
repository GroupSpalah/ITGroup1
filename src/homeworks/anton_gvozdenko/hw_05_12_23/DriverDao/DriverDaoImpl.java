package homeworks.anton_gvozdenko.hw_05_12_23.DriverDao;

import homeworks.anton_gvozdenko.hw_01_12_23.NoteBook;
import homeworks.anton_gvozdenko.hw_05_12_23.Truck;

import java.sql.*;
import java.util.List;
import java.util.Objects;

import static homeworks.anton_gvozdenko.hw_01_12_23.util.Constans.*;

public class DriverDaoImpl implements DriverDao {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        return connection;
    }

    public void   showAllDrivers() throws SQLException {
        String query = "SELECT * FROM Driver";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                        String lastName = resultSet.getString("last_name");
                        int age = resultSet.getInt("age");
            String qualification = resultSet.getString("qualification");
                System.out.println(firstName + " " + lastName + " " + age + " " + qualification);

            }

        }
    }

    public void delete() throws SQLException {

        String query = "DELETE FROM Driver";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.executeUpdate();
        }
    }

    public  void   insert(Driver driver) throws SQLException {

        String query = "INSERT INTO Driver(first_name, last_name,age,qualification) " +
                "VALUES(?,?,?,?)";

     /*   try (PreparedStatement statement = getConnection().prepareStatement(query)) {
                  statement.setString(1,); */

        }
    }

