package homeworks.mihail_chursinov.hw_09_05_23;

public class Test {
    public static void main(String[] args) {
        Plane plane = new Plane("An", "225", 850, 11000);
        Destroyer destroyer = new Destroyer("F", "35", 1900, 15000);
        Bomber bomber = new Bomber("B", "52", 957, 16765);

        String testPlane = plane.showInfo();
        String testDestroyer = destroyer.showInfo();
        String testBomber = bomber.showInfo();
        System.out.println(testPlane);
        System.out.println(testDestroyer);
        System.out.println(testBomber);
    }
}
