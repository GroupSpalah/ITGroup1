package lessons.ls_04_23.ls_04_04_23.man_position;

public class TestPosition {
    public static void main(String[] args) {
        Position it = new Position("IT");
        Position manager = new Position("Manager");

        String firstName = "John";

        Man john = new Man(32, firstName, "Travolta", Gender.MALE, it);
        Man ben = new Man(32, "Ben", "Travolta", Gender.MALE, manager);

        boolean isEqualPositions = ManService.comparePositions(john, ben);

//        System.out.println(isEqualPositions);

        john.showInfo();
    }
}
