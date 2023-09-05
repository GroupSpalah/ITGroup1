package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceMan serviceMan = new ServiceMan();
        Address addressJohn = new Address("UK", "London", "Brick Lane", 5);
        Address addressJack = new Address("USA", "NY", "Manhattan", 15);
        Address addressPetro = new Address("Ukraine", "Kyiv", "Khreshchatyk", 22);

        Man john = new Man("John", "Terry", 22, 3, addressJohn);
        Man jack = new Man("Jack", "Jonson", 22, 3, addressJack);
        Man petro = new Man("Petro", "Savchuk", 23, 3, addressPetro);

        List<Man> men = new LinkedList<>(List.of(john, jack, petro));

//        serviceMan.showInfoAllMan(men);
//        serviceMan.showAllAddress(men);
//        serviceMan.showInfoWhenAgeMoreTwenty(men);
//        serviceMan.changeMan(men);
//        serviceMan.showInfoWhenCountryUK(men);
       // serviceMan.groupingAmountOfChildren(men);
       // serviceMan.groupingAmountOfChildrenAndAge(men);
      //serviceMan.groupingAmountOfCity(men);
        serviceMan.groupingAmountOfCityWithAddress(men);
    }
}
