package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Cow extends Animal{
    public Cow(float weight, int id) {
        super(weight, id);
    }

    @Override
    String makeSound() {
        return "Myy";
    }

    @Override
    void interaction() {
        System.out.println("Cow: " + getId() + "\t" + "Weight: " + getWeight() + "\t" +  "Say: " + makeSound());
    }

    @Override
    void digHole() {

    }

}
