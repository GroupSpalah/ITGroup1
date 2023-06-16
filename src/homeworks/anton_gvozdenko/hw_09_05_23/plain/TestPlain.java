package homeworks.anton_gvozdenko.hw_09_05_23.plain;

public class TestPlain {
    public static void main(String[] args) {
        Plain plain = new Plain("Ruslan", "AM", 1000, 5000);
        Bomber bomber = new Bomber("MIG", "27", 2000, 10000, 500000);
        Fighter fighter = new Fighter("General Dynamics", "F -16", 9000, 8000, 700000);

        plain.createPrice();
        bomber.createPrice();
        fighter.createPrice();
        plain.showInfo();
        fighter.showInfo();
        bomber.showInfo();

    }


}
