package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

import java.util.*;

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