package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

import java.util.Objects;

/**
 * Сущность Man(имя, фамилия, возраст, количество детей, Адрес), Адрес(страна, город, улица, номер дома)
 * Использовать коллекцию LinkedList. Действия для класса Адрес делать из класса Man.
 */

public class Man implements Comparable<Man> {
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

    public Man(int age, int countOfChildren) {
        this.age = age;
        this.countOfChildren = countOfChildren;

    }

    public Man(String city, String street) {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public int compareTo(Man o) {
        return firstName.compareTo(o.firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age && countOfChildren == man.countOfChildren && Objects.equals(firstName, man.firstName) && Objects.equals(lastName, man.lastName) && Objects.equals(address, man.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, countOfChildren, address);
    }
}
