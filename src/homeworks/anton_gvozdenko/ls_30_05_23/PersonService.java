package lessons.ls_30_05_23;

import homeworks.anton_gvozdenko.hw_26_05_23.Formalist;
import homeworks.anton_gvozdenko.hw_26_05_23.Informal;
import homeworks.anton_gvozdenko.hw_26_05_23.Person;
import homeworks.anton_gvozdenko.hw_26_05_23.Realist;

public class PersonService {
    private Person[] people;

    public PersonService() {
        people = new Person[]{
                new Informal(),
                new Formalist(),
                new Realist(),
                new Informal()
        };
    }

    public void talk() {
        for (int i = 0; i < people.length; i++) {
            Person man1 = people[i];

            for (int j = i + 1; j < people.length; j++) {
                Person man2 = people[j];

                System.out.println(
                        man1.getName() +  ":\t" +
                                man1.sayHello(man2) + ":\t\n" +
                                man2.getName() + ":\t" +
                                man2.sayHello(man1)
                        );
            }
        }
    }
}
