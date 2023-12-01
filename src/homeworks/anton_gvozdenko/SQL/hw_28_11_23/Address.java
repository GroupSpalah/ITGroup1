package homeworks.anton_gvozdenko.SQL.hw_28_11_23;

import java.sql.*;
import java.util.Objects;

public class Address {
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(String country, String city, String street, int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    class DbConnector {

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
                statement.setString(1, "Spain");
                statement.setString(2, "Madrid");
                statement.setString(3, "Ivana Sirka");
                statement.setInt(4, 2);

                statement.executeUpdate();
            }
        }

        public static void delete(int houseNumber) throws SQLException {

            String query = "DELETE FROM Address WHERE house_number = ?";

            try (PreparedStatement statement = getConnection().prepareStatement(query)) {
                statement.setInt(1, 1);

                statement.executeUpdate();
            }
        }
    }
    public static void main(String[] args) throws SQLException {
        Address address = new Address("Germany","Berlin","Kaiser",1);

            DbConnector.showAllAddresses();
             DbConnector.insert(address);
            DbConnector.update(address);
            DbConnector.delete(1);
    }
    }


