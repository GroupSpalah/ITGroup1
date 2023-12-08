package homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.impl;

import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.Notebook;
import homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.dao.NotebookDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static homeworks.mihail_chursinov.hw_12_23.hw_01_12_23.util.Constans.*;

public class NotebookDAOImpl implements NotebookDAO {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(connection)) {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }
        return connection;
    }

    public void add(Notebook notebook) throws SQLException {
        String query = "INSERT INTO notebook(model, producer, release_date, ram_amount, ssd_capacity, cpu) " +
                "VALUES(?,?,?,?,?,?)";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, notebook.model());
            statement.setString(2, notebook.producer());
            statement.setString(3, notebook.releaseDate());
            statement.setInt(4, notebook.ramAmount());
            statement.setInt(5, notebook.ssdCapacity());
            statement.setString(6, notebook.cpu());

            statement.executeUpdate();
        }
    }

    public void showForID(int id) throws SQLException {
        String query = "SELECT * FROM notebook WHERE id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int notebookId = resultSet.getInt("id");
                    String model = resultSet.getString("model");
                    String producer = resultSet.getString("producer");
                    String releaseDate = resultSet.getString("release_date");
                    int ramAmount = resultSet.getInt("ram_amount");
                    int ssdCapacity = resultSet.getInt("ssd_capacity");
                    int cpu = resultSet.getInt("cpu");

                    System.out.println("Notebook ID: " + notebookId);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + producer);
                    System.out.println("Release Date: " + releaseDate);
                    System.out.println("RAM Amount: " + ramAmount);
                    System.out.println("SSD Capacity: " + ssdCapacity);
                    System.out.println("CPU: " + cpu);
                }
            }
        }
    }

    public void showAll() throws SQLException {
        String query = "SELECT * FROM notebook";

        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            List<Notebook> notebooks = new ArrayList<>();

            while (resultSet.next()) {
                int notebookId = resultSet.getInt("id");
                String model = resultSet.getString("model");
                String producer = resultSet.getString("producer");
                String releaseDate = resultSet.getString("release_date");
                int ramAmount = resultSet.getInt("ram_amount");
                int ssdCapacity = resultSet.getInt("ssd_capacity");
                String cpu = resultSet.getString("cpu");

                Notebook notebook = new Notebook(notebookId, model, producer, releaseDate, ramAmount, ssdCapacity, cpu);
                notebooks.add(notebook);

            }
            notebooks.forEach(System.out::println);
        }
    }

    public void deleteForID(int id) throws SQLException {
        String query = "DELETE FROM notebook WHERE id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, id);

            statement.executeUpdate();

        }
    }
    public void deleteAll() throws SQLException {
        String query = "DELETE FROM notebook";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {

            statement.executeUpdate();

        }
    }
    public void updateForId(Notebook notebook) throws SQLException {
        String query = "UPDATE notebook SET model = ?, producer = ?, release_date = ?, ram_amount = ?," +
                "ssd_capacity = ?, cpu = ? WHERE id = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, notebook.model());
            statement.setString(2, notebook.producer());
            statement.setString(3, notebook.releaseDate());
            statement.setInt(4, notebook.ramAmount());
            statement.setInt(5, notebook.ssdCapacity());
            statement.setString(6, notebook.cpu());
            statement.setInt(7, notebook.id());

            statement.executeUpdate();

        }
    }
    public void showForModel(String model) throws SQLException {
        String query = "SELECT * FROM notebook WHERE model = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, model);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int notebookId = resultSet.getInt("id");
                    String producer = resultSet.getString("producer");
                    String releaseDate = resultSet.getString("release_date");
                    int ramAmount = resultSet.getInt("ram_amount");
                    int ssdCapacity = resultSet.getInt("ssd_capacity");
                    String cpu = resultSet.getString("cpu");

                    System.out.println("Notebook ID: " + notebookId);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + producer);
                    System.out.println("Release Date: " + releaseDate);
                    System.out.println("RAM Amount: " + ramAmount);
                    System.out.println("SSD Capacity: " + ssdCapacity);
                    System.out.println("CPU: " + cpu);
                }
            }
        }
    }

    public void showForDate(String date) throws SQLException {
        String query = "SELECT * FROM notebook WHERE release_date = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, date);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int notebookId = resultSet.getInt("id");
                    String producer = resultSet.getString("producer");
                    String model = resultSet.getString("model");
                    int ramAmount = resultSet.getInt("ram_amount");
                    int ssdCapacity = resultSet.getInt("ssd_capacity");
                    String cpu = resultSet.getString("cpu");

                    System.out.println("Notebook ID: " + notebookId);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + producer);
                    System.out.println("Release Date: " + date);
                    System.out.println("RAM Amount: " + ramAmount);
                    System.out.println("SSD Capacity: " + ssdCapacity);
                    System.out.println("CPU: " + cpu);
                }
            }
        }
    }
    public void showForRamAndSsd(int ram, int ssd) throws SQLException {
        String query = "SELECT * FROM notebook WHERE ram_amount = ? AND ssd_capacity = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setInt(1, ram);
            statement.setInt(2, ssd);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int notebookId = resultSet.getInt("id");
                    String producer = resultSet.getString("producer");
                    String model = resultSet.getString("model");
                    String releaseDate = resultSet.getString("release_date");
                    String cpu = resultSet.getString("cpu");

                    System.out.println("Notebook ID: " + notebookId);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + producer);
                    System.out.println("Release Date: " + releaseDate);
                    System.out.println("RAM Amount: " + ram);
                    System.out.println("SSD Capacity: " + ssd);
                    System.out.println("CPU: " + cpu);
                }
            }
        }
    }
    public void showForCpu(String cpu) throws SQLException {
        String query = "SELECT * FROM notebook WHERE cpu = ?";

        try (PreparedStatement statement = getConnection().prepareStatement(query)) {
            statement.setString(1, cpu);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int notebookId = resultSet.getInt("id");
                    String producer = resultSet.getString("producer");
                    String releaseDate = resultSet.getString("release_date");
                    int ramAmount = resultSet.getInt("ram_amount");
                    int ssdCapacity = resultSet.getInt("ssd_capacity");
                    String model = resultSet.getString("model");


                    System.out.println("Notebook ID: " + notebookId);
                    System.out.println("Model: " + model);
                    System.out.println("Producer: " + producer);
                    System.out.println("Release Date: " + releaseDate);
                    System.out.println("RAM Amount: " + ramAmount);
                    System.out.println("SSD Capacity: " + ssdCapacity);
                    System.out.println("CPU: " + cpu);
                }
            }
        }
    }
}
