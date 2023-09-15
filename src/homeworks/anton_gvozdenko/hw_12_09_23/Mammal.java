package homeworks.anton_gvozdenko.hw_12_09_23;

public class Mammal extends Animal {
    private int babyWeight;

    public Mammal(String id, int weight, String sound) {
        super(id, weight, sound);
        this.babyWeight = 0;
    }

    public void giveBirth(int babyWeight) {
        System.out.println("Тварина народила малюка з вагою " + babyWeight + " грамів.");
        weight -= babyWeight;
        System.out.println("Нова вага: " + weight);
    }
}