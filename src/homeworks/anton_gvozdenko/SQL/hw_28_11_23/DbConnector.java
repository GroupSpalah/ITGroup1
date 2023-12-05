package homeworks.anton_gvozdenko.SQL.hw_28_11_23;

import java.sql.*;
import java.util.Objects;

public class DbConnector {
    private static Connection connection;
    public static final String URL =
            "jdbc:mysql://localhost:3306/Address_sql?serverTimezone=Europe/Kiev";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        return connection;
    }

    public static void showAllAddresses() throws SQLException {
        String query = "SELECT * FROM address";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int houseNumber = resultSet.getInt("house_number");
                String country = resultSet.getString("country");
                String city = resultSet.getString("city");
                String street = resultSet.getString("street");

                System.out.println(houseNumber + "\t" + country + "\t" + city + "\t" + street);
            }
        }

    }

    public static void insert(Address address) throws SQLException {

        String query = "INSERT INTO Address(country, city,street) " +
                "VALUES(?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {

            statement.setString(1, address.getCountry());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());

            statement.executeUpdate();
        }
    }

    public static void update(Address address) throws SQLException {

        String query = "UPDATE Address SET country = ?, city = ?, street = ? WHERE house_number = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, address.getCountry());
            statement.setString(2, address.getCity());
            statement.setString(3, address.getStreet());
            statement.setInt(4, address.getHouseNumber());

            statement.executeUpdate();
        }
    }

    public static void delete(int houseNumber) throws SQLException {

        String query = "DELETE FROM Address WHERE house_number = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, houseNumber);

            statement.executeUpdate();
        }
    }
}

