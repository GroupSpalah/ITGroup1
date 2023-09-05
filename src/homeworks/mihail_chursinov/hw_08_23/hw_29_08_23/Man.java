package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

/**
 * Сущность Man(имя, фамилия, возраст, количество детей, Адрес), Адрес(страна, город, улица, номер дома)
 * Использовать коллекцию LinkedList. Действия для класса Адрес делать из класса Man.
  */

public class Man {
    private String firstName;
    private String lastName;
    private int age;
    private int countOfChildren;
    private Address address;

    public Man(String firstName, String lastName, int age, int countOfChildren, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "firstName = " + firstName + '\'' +
                ", lastName = " + lastName + '\'' +
                ", age = " + age +
                ", countOfChildren = " + countOfChildren +
                "\t" + address +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public Address getAddress() {
        return address;
    }
}
