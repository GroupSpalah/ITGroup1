package homeworks.anton_gvozdenko.hw_01_12_23.dao.impl;


import homeworks.anton_gvozdenko.hw_01_12_23.NoteBook;
import homeworks.anton_gvozdenko.hw_01_12_23.dao.NotebookDAO;

import java.sql.*;

import java.util.Objects;

import static homeworks.anton_gvozdenko.hw_01_12_23.util.Constans.*;

public class NotebookDAOImpl implements NotebookDAO {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }

        return connection;
    }

    public void showAllAddresses() throws SQLException {
        String query = "SELECT * FROM Notebook";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String model = resultSet.getString("model");
                String manufacturer = resultSet.getString("manufacturer");
                String date = resultSet.getString("date_creation");
                int ram = resultSet.getInt("RAM");
                int ssd = resultSet.getInt("SSD");
                String cpu = resultSet.getString("CPU");
                int id = resultSet.getInt("notebook_id");

                System.out.println(model + " " + manufacturer + " " + date + " " + ram + " " + ssd + " " +
                        cpu + " " + id);
            }
        }

    }

    public void showByID(int id) throws SQLException {
        String query = "SELECT * FROM Notebook WHERE notebook_id =  " + id;

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String model = resultSet.getString("model");
                String manufacturer = resultSet.getString("manufacturer");
                String date = resultSet.getString("date_creation");
                int ram = resultSet.getInt("RAM");
                int ssd = resultSet.getInt("SSD");
                String cpu = resultSet.getString("CPU");


                System.out.println(model + " " + manufacturer + " " + date + " " + ram + " " + ssd + " " +
                        cpu + " ");

            }
        }
    }


    public static void showByModel(String model) throws SQLException {
        String query = "SELECT * FROM Notebook WHERE model = '" + model + "'";
        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String manufacturer = resultSet.getString("manufacturer");
                String date = resultSet.getString("date_creation");
                int ram = resultSet.getInt("RAM");
                int ssd = resultSet.getInt("SSD");
                String cpu = resultSet.getString("CPU");


                System.out.println(manufacturer + " " + date + " " + ram + " " + ssd + " " +
                        cpu);
            }
        }
    }

    public static void showByDate(String date) throws SQLException {
        String query = "SELECT * FROM Notebook WHERE date_creation = '" + date + "'";


        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String manufacturer = resultSet.getString("manufacturer");
                int ram = resultSet.getInt("RAM");
                int ssd = resultSet.getInt("SSD");
                String cpu = resultSet.getString("CPU");


                System.out.println(manufacturer + " " + ram + " " + ssd + " " +
                        cpu);

            }
        }
    }

    public static void showByRamSsd(int ram, int ssd) throws SQLException {
        String query = "SELECT * FROM Notebook WHERE RAM = " + ram + " AND SSD = " + ssd;

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {

                String manufacturer = resultSet.getString("manufacturer");
                String model = resultSet.getString("model");
                String cpu = resultSet.getString("CPU");
                String date = resultSet.getString("date_creation");


                System.out.println(manufacturer + " " + model + " " + date + " " + ram + " " + ssd + " " +
                        cpu);

            }
        }
    }

    public static void showByCpu(String cpu) throws SQLException {
        String query = "SELECT * FROM Notebook WHERE CPU = '" + cpu + "'";


        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String model = resultSet.getString("model");
                String manufacturer = resultSet.getString("manufacturer");
                String date = resultSet.getString("date_creation");
                int ram = resultSet.getInt("RAM");
                int ssd = resultSet.getInt("SSD");
                int id = resultSet.getInt("notebook_id");

                System.out.println(model + " " + manufacturer + " " + date + " " + ram + " " + ssd + " " +
                        cpu + " " + id);
            }
        }
    }

    public static void insert(NoteBook noteBook) throws SQLException {

        String query = "INSERT INTO Notebook(model, manufacturer,date_creation,RAM,SSD,CPU,notebook_id) " +
                "VALUES(?,?,?,?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {

            statement.setString(1, noteBook.getModel());
            statement.setString(2, noteBook.getManufacturer());
            statement.setString(3, noteBook.getDate());
            statement.setInt(4, noteBook.getRam());
            statement.setInt(5, noteBook.getSsd());
            statement.setString(6, noteBook.getCpu());
            statement.setInt(7, noteBook.getId());

            statement.executeUpdate();
        }
    }

    public static void updateById(NoteBook noteBook, int id) throws SQLException {

        String query = "UPDATE Notebook SET model = ?, manufacturer = ?, date_creation = ? , RAM = ?,SSD = ?,CPU = ?," +
                " notebook_id = ?" +
                " WHERE notebook_id = " + id;

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, noteBook.getModel());
            statement.setString(2, noteBook.getManufacturer());
            statement.setString(3, noteBook.getDate());
            statement.setInt(4, noteBook.getRam());
            statement.setInt(5, noteBook.getSsd());
            statement.setString(6, noteBook.getCpu());
            statement.setInt(7, noteBook.getId());

            statement.executeUpdate();
        }
    }

    public static void deleteById(int id) throws SQLException {

        String query = "DELETE FROM Notebook WHERE notebook_id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            statement.executeUpdate();
        }
    }

    public static void delete() throws SQLException {

        String query = "DELETE FROM Notebook ";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.executeUpdate();
        }
    }
}



