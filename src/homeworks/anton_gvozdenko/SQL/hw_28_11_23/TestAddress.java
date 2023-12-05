package homeworks.anton_gvozdenko.SQL.hw_28_11_23;

import java.sql.SQLException;

public class TestAddress {
    public static void main(String[] args) throws SQLException {
        Address address = new Address("Germany", "Berlin", "Kaiser", 1);
        DbConnector.showAllAddresses();
        DbConnector.insert(address);
        DbConnector.update(address);
        DbConnector.delete(1);
    }
}