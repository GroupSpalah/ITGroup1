package homeworks.mihail_chursinov.hw_11_23;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        //Task.readAddress();
        //Task.insertAddress();
        //Task.updateAddress();
        //TaskSQL.deleteAddress();

        Address address = new Address(0,"Ukraine", "Dnipo","Lvivska", 22);
        Address address1 = new Address(9,"USA", "Detroit","Lee", 17);

        //ServiceAddress.insertAddress(address);
        //ServiceAddress.updateAddress(address1);
        //ServiceAddress.deleteAddress(8);
        ServiceAddress.readAddress();
    }
}
