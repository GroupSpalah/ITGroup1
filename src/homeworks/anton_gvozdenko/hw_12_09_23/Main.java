package homeworks.anton_gvozdenko.hw_12_09_23;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Cat cat = new Cat("1", 3000);
        Dog dog = new Dog("2", 5000);
        Goose goose = new Goose("3", 2000);
        Cow cow = new Cow("4", 6000);
        farm.addAnimal(cat);
        farm.addAnimal(dog);
        farm.addAnimal(goose);
        farm.addAnimal(cow);

        farm.connectWithAnimal("1");
        farm.connectWithAnimal("2");
        farm.connectWithAnimal("3");
        farm.connectWithAnimal("4");

        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        goose.layEgg();
        dog.dig();
        dog.dig();
        dog.dig();
        dog.dig();
        cat.giveBirth(500);

        Goose goldenGoose = farm.findGoldenGoose();
        if (goldenGoose != null) {
            System.out.println("Золотий гусак знайдений! Він зніс більше всіх яєць.");
        } else {
            System.out.println("Золотий гусак не знайдений.");
        }
    }
    }
}