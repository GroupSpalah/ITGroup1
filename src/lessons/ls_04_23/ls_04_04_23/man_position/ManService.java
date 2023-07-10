package lessons.ls_04_23.ls_04_04_23.man_position;

public class ManService {

    public static boolean comparePositions(Man man1, Man man2) {
        Position position1 = man1.getPosition();
        Position position2 = man2.getPosition();

        String name1 = position1.getName();
        String name2 = position2.getName();

        boolean equalPositions = name1.equals(name2);

        return equalPositions;
    }

    public static boolean comparePositions1(Man man1, Man man2) {
        String position1 = man1.getPosition().getName();
        String position2 = man2.getPosition().getName();

        return position2.equals(position1);
    }

    public static boolean compareLastNames(Man man1, Man man2) {
        String lastName1 = man1.getLastName();
        String lastName2 = man2.getLastName();

        return lastName1.equals(lastName2);
    }

}
