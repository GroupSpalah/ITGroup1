package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Dog extends Animal implements Hole{

    private int holeCount;

    public Dog(float weight, int id, int holeCount) {
        super(weight, id);
        this.holeCount = 0;
    }

    @Override
    String makeSound() {
        return "Gaw";
    }

    @Override
    void interaction() {
        System.out.println("Dog: " + getId() + "\t" + "Weight: " + getWeight() + "\t" + "Say: " + makeSound());
    }

    public void digHole() {
        if (holeCount < 10) {
            holeCount++;
            System.out.println("Dog dug a hole!");
            return;
        }
        System.out.println("Dog can't dig more holes!");
    }
}
