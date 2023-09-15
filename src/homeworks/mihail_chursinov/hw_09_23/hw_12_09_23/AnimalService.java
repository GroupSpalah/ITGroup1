package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    private List<Animal> animals;


    public AnimalService() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void interactWithAnimals() {
        animals
                .forEach(Animal::interaction);
    }

    public void digHoles() {
        animals.forEach(Animal::digHole);
    }
}

