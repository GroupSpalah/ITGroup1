package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        List<Geese> geese = new ArrayList<>();
        geese.add(new Geese(1000, 11, 5));
        geese.add(new Geese(1200, 12, 4));
        geese.add(new Geese(900, 19, 2));

        Cat cat = new Cat(1500, 12);
        Dog dog = new Dog(3000, 21, true);
        Cow cow = new Cow(10000, 31);

        animalService.addAnimal(cat);
        animalService.addAnimal(dog);
        animalService.addAnimal(cow);

        animalService.interactWithAnimals();
        animalService.digHoles();
        animalService.demolishMaxEggs(geese);

    }
}
