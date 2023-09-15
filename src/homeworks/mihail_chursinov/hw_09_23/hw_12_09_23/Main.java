package homeworks.mihail_chursinov.hw_09_23.hw_12_09_23;

public class Main {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();

        Cat cat = new Cat(1500, 12);
        Dog dog = new Dog(3000, 21, true);
        Cow cow = new Cow(10000, 31);
        Geese geese = new Geese(1000, 44);

        animalService.addAnimal(cat);
        animalService.addAnimal(dog);
        animalService.addAnimal(cow);
        animalService.addAnimal(geese);



      //  animalService.interactWithAnimals();
        animalService.digHoles();

    }
}
