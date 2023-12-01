package homeworks.mihail_chursinov.hw_11_23;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceAddress {
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
             ResultSet resultSet = statement.executeQuery(query)) {
            List<Address> addresses = new ArrayList<>();

            while (resultSet.next()) {
                int addressId = resultSet.getInt("address_id");
                String country = resultSet.getString("country");
                String city = resultSet.getString("city");
                String street = resultSet.getString("street");
                int numberHouse = resultSet.getInt("number_house");

                Address address = new Address(addressId, country, city, street, numberHouse);
                addresses.add(address);

            }
            for (Address address : addresses) {
                System.out.println(address);
            }

        }


    }

    public static void insertAddress(Address address) throws SQLException {
        String query = "INSERT INTO address(country, city, street, number_house) " +
                "VALUES(?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, address.country());
            statement.setString(2, address.city());
            statement.setString(3, address.street());
            statement.setInt(4, address.number_house());

            statement.executeUpdate();

        }
    }

    public static void updateAddress(Address address) throws SQLException {
        String query = "UPDATE address SET country = ?, city = ?, street = ?, number_house = ? WHERE address_id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, address.country());
            statement.setString(2, address.city());
            statement.setString(3, address.street());
            statement.setInt(4, address.number_house());
            statement.setInt(5, address.address_id());

            statement.executeUpdate();

        }
    }
    public static void deleteAddress(int id) throws SQLException {
        String query = "DELETE FROM address WHERE address_id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            statement.executeUpdate();

        }
    }


}
