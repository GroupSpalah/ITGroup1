package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Mammal extends Animal {
    private float babyWeight;

    public Mammal(float weight, int id, float babyWeight) {
        super(weight, id);
        this.babyWeight = babyWeight;
    }


    public void giveBirth(float babyWeight) {
        System.out.println(babyWeight);
        float current = getWeight() - babyWeight;
        System.out.println("New weight: " + current);
    }

    @Override
    String makeSound() {
        return null;
    }

    @Override
    void interaction() {
    }
}
