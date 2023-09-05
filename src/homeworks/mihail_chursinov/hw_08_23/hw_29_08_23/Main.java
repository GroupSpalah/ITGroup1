package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceMan serviceMan = new ServiceMan();
        Address addressJohn = new Address("UK", "London", "Brick Lane", "2");
        Address addressJack = new Address("USA", "NY", "Manhattan", "15");
        Address addressPetro = new Address("Ukraine", "Kyiv", "Khreshchatyk", "22");

        Man john = new Man("John", "Terry", 27, 2, addressJohn);
        Man jack = new Man("Jack", "Jonson", 22, 1, addressJack);
        Man petro = new Man("Petro", "Savchuk", 31, 3, addressPetro);

        LinkedList<Man> men = new LinkedList<>(List.of(john, jack, petro));
        LinkedList<Address> addresses = new LinkedList<>(List.of(addressJack, addressJohn, addressPetro));

        serviceMan.showInfoAllMan(men);
        serviceMan.showAllAddress(addresses);
    }
}
