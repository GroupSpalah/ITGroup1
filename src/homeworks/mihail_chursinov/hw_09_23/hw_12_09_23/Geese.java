package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Geese extends Animal{
    public Geese(float weight, int id) {
        super(weight, id);
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

}
