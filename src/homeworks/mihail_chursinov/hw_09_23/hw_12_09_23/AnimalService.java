package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AnimalService {
    private List<Animal> animals;
    private List<Dog> dogs;

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
        dogs.forEach(Dog::digHole);
    }

    public void demolishMaxEggs(List<Geese> geese) {
        Comparator<Geese> comparator = Comparator.comparing(Geese::getAmountEgg);

        Optional<Geese> maxAmountEgg = geese
                .stream()
                .max(comparator);

        if (maxAmountEgg.isPresent()) {
            Geese maxGeese = maxAmountEgg.get();

            System.out.println(maxGeese);
        }
    }
}