package homeworks.anton_gvozdenko.hw_12_09_23;


public class Animal {
    private String id;
    int weight;
    private String sound;

    public Animal(String id, int weight, String sound) {
        this.id = id;
        this.weight = weight;
        this.sound = sound;
    }

    public String getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public String makeSound() {
        return sound;
    }
}



