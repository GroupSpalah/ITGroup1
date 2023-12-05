package homeworks.mihail_chursinov.hw_11_23;

import java.sql.*;
import java.util.Objects;

public class TaskSQL {
    private static Connection connection;
    public static final String URL =
            "jdbc:mysql://localhost:3306/address_sql?serverTimezone=Europe/Kiev";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }
        return connection;
    }

    public static void readAddress() throws SQLException {
        String query = "Select * From address";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query);) {

            while (resultSet.next()) {
                int addressId = resultSet.getInt("addressId");
                String country = resultSet.getString("country");
                String city = resultSet.getString("city");
                int numberHouse = resultSet.getInt("numberHouse");

                System.out.println(addressId + "\t" + country + "\t" + city + "\t" + numberHouse);
            }
        }

    }

    public static void insertAddress() throws SQLException {
        String query = "INSERT INTO address(country, city, street, numberHouse) " +
                "VALUES(?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, "Ukraine");
            statement.setString(2, "Lviv");
            statement.setString(3, "Lvivska");
            statement.setInt(4, 22);

            statement.executeUpdate();

        }
    }

    public static void updateAddress() throws SQLException {
        String query = "UPDATE address SET country = ?, city = ?, street = ?, numberHouse = ? WHERE addressId = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, "Ukraine");
            statement.setString(2, "Odesa");
            statement.setString(3, "Moldovanka");
            statement.setInt(4, 18);
            statement.setInt(5, 4);

            statement.executeUpdate();

        }
    }
    public static void deleteAddress() throws SQLException {
        String query = "DELETE FROM address WHERE addressId = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, 5);

            statement.executeUpdate();

        }
    }


}
