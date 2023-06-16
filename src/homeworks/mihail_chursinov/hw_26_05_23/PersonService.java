package homeworks.mihail_chursinov.hw_26_05_23;

public class PersonService {
    private Person[] people;

    public PersonService() {
        people = new Person[]{
                new Informals(),
                new Formalists(),
                new Realists(),
                new Formalists(),
                new Realists(),
        };
    }

    public void talk() {
        for (int i = 0; i < people.length; i++) {
            Person man1 = people[i];

            for (int j = i + 1; j < people.length; j++) {
                Person man2 = people[j];

                System.out.println(man1.getName() + ":\t" +
                        man1.sayHello(man2) + ":\t\n" +
                        man2.getName() + ":\t" +
                        man2.sayHello(man1)
                );

            }
        }
    }
}
