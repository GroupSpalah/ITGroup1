package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {

    private int holeCount = 0;

    public Dog(float weight, int id, boolean canDigHoles) {
        super(weight, id);
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
        } else {
            System.out.println("Dog can't dig more holes!");
        }
    }
}
