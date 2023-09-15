package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Cat extends Animal {

    public Cat(float weight, int id) {
        super(weight, id);
    }

    @Override
    String makeSound() {
        return "Mew";
    }

    @Override
    void interaction() {
        System.out.println("Cat: " + getId() + "\t" + "Weight: " + getWeight() + "\t" +  "Say: " + makeSound());
    }

    @Override
    void digHole() {

    }


}
