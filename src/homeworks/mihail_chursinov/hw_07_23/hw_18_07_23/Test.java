package homeworks.mihail_chursinov.hw_07_23.hw_18_07_23;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Position automation = new Position("Automation");
        Position it = new Position("It");
        Position manager = new Position("Manager");

        Person john = new Person("John", 28);
        Person clark = new Person("Clark", 32);
        Person ben = new Person("Ben", 36);

        Map<Person, Position> map = Map.of(
                john, automation,
                clark, it,
                ben, manager
        );

        PersonService personService = new PersonService();
//        personService.showAge(map);
//        personService.showLengthOfTheName(map);
      personService.showLengthOfThePosition(map);
   //     personService.showLengthOfTheNamePosition(map);
    }
}
