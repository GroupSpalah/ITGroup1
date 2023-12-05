package lessons.ls_11_23.ls_28_11_23;

import lessons.ls_11_23.ls_28_11_23.util.ConnectionUtil;

import java.sql.*;
import java.util.Objects;

import static lessons.ls_11_23.ls_28_11_23.util.Contstans.*;
import static lessons.ls_11_23.ls_28_11_23.util.ConnectionUtil.*;

public class DbConnector {
    private static Connection connection;

   /* public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        return ConnectionUtil.getConnection();
    }*/

    public static void showAllMen() throws SQLException {
        String query = "SELECT * FROM man";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("man_id");
                int fkAddress = resultSet.getInt("FK_Man_Address");
                String firstName = resultSet.getString("first_name");
                String dob = resultSet.getString("dob");

                System.out.println(id + "\t" + firstName + "\t" + fkAddress + "\t" + dob);
            }
        }
        /*
        statement.close();
        resultSet.close();*/
    }

    public static void insert() throws SQLException {
       /* String query = "INSERT INTO man(first_name, dob, FK_Man_Address) " +
                "VALUES(" + "John," + "2020-10-11," + "1," + ")";*/

        String query = "INSERT INTO man(first_name, dob, FK_Man_Address) " +
                "VALUES(?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, "John");
            statement.setString(2, "2020-11-11");
            statement.setInt(3, 1);

            statement.executeUpdate();
        }
    }

    public static void update() throws SQLException {

        String query = "UPDATE man SET first_name = ?, dob = ?, FK_Man_Address = ? WHERE man_id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, "Elza");
            statement.setString(2, "2025-11-11");
            statement.setInt(3, 1);
            statement.setInt(4, 1);

            statement.executeUpdate();
        }
    }

    public static void delete() throws SQLException {

        String query = "DELETE FROM man WHERE man_id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, 1);

            statement.executeUpdate();
        }
    }

    public static void main(String[] args) throws SQLException {
//        DbConnector.showAllMen();
//        DbConnector.insert();
//        DbConnector.update();
        DbConnector.delete();
    }
}
