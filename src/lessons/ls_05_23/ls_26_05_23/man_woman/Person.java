package lessons.ls_05_23.ls_26_05_23.man_woman;

/**
 * Опишите классы Man и Woman, наследующие класс Person.
 * Оба класса имеют свойства:
 * firstName
 * lastName
 * age
 * partner
 * другие свойства которые вы считаете необходимыми
 * Оба класса имеют методы:
 * Конструктор включающий все поля
 * сеттер и геттер на поле age, и другие свойства, где это необходимо
 * isRetired (возвращает true, если возраст больше пенсионного порога 60 для женщин и 65 для мужчин)
 * registerPartnership (подразумевается, что жена принимает фамилию мужа)
 * deregisterPartnership (в качестве входного параметра принимает boolean: возврат к предыдущей фамилии)
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person person;

    public Person(String firstName, String lastName, int age, Person person) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.person = person;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract boolean isRetired();

    public int getAge() {
        return age;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age, null);
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }
}

class Woman extends Person {

    private String womanLastName;

    public Woman(String firstName, String lastName, int age, Person person) {
        super(firstName, lastName, age, person);
        womanLastName = lastName;

    }

    @Override
    public boolean isRetired() {
        return getAge() > 60;
    }

    public void registerPartnership() {
        Person husband = getPerson();

        String husbandLastName = husband.getLastName();

        setLastName(husbandLastName);
    }

    public void deregisterPartnership() {
        setLastName(womanLastName);
    }
}

class TestManWoman {
    public static void main(String[] args) {

        Person man = new Man("John", "Kennedi", 35);

        Woman woman = new Woman("Ann", "Travolta", 32, man);

        man.setPerson(woman);

        woman.registerPartnership();

//        System.out.println(woman.getLastName());

        woman.deregisterPartnership();

        System.out.println(woman.getLastName());

    }
}


