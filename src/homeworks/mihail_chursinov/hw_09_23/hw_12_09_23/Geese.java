package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Geese extends Animal{
    private int amountEgg;

    public Geese(float weight, int id, int amountEgg) {
        super(weight, id);
        this.amountEgg = amountEgg;
    }

    public int getAmountEgg() {
        return amountEgg;
    }

    @Override
    String makeSound() {
        return "Gyy";
    }

    @Override
    void interaction() {
        System.out.println("Geese: " + getId() + "\t" + "Weight: " + getWeight() + "\t" +  "Say: " + makeSound());
    }

    @Override
    void digHole() {

    }

    @Override
    public String toString() {
        return "Geese{" +
                 "Weight: " + getWeight() + "\t" + "Id geese: " + getId() + "\t" +
                "amount eggs = " + amountEgg;
    }
}
