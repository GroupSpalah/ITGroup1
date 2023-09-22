package homeworks.anton_gvozdenko.hw_12_09_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

    public Goose findGoldenGoose() {
        Optional<Goose> goldenGoose = animals.stream()
                .filter(animal -> animal instanceof Goose)
                .map(animal -> (Goose) animal)
                .max(Comparator.comparingInt(Goose::getEggCount));
        return goldenGoose.orElse(null);
    }
}





