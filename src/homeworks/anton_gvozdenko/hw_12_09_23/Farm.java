package homeworks.anton_gvozdenko.hw_12_09_23;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals;
    private List<Goose> goose;

    public Farm() {
        this.animals = new ArrayList<>();
        this.goose = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void connectWithAnimal(String animalId) {
        animals.stream()
                .filter(animal -> animal.getId().equals(animalId))
                .forEach(animal -> System.out.println("Звук, видаваний твариною з ідентифікатором "
                        + animalId + ": " + animal.makeSound()));
    }

}





