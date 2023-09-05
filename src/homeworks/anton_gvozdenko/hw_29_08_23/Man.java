package homeworks.anton_gvozdenko.hw_29_08_23;


import java.util.List;
import java.util.stream.Collectors;

record Address(
        String country, String city, String street,
        int numberOfHome) {
}

class Man {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }
}

class Main {
    public static void main(String[] args) {
        Address usa = new Address("US", "New York", "Soborna", 5);
        Address ukraine = new Address("Ukraine", "Dnipro", "Peremohy", 11);
        Address canada = new Address("Canada", "Toronto", "Pravdy", 3);

        Man john = new Man("John", "Kennedy", 21, 3, usa);
        Man ben = new Man("Ben", "Bush", 25, 4, canada);
        Man steven = new Man("Steven", "Tramp", 20, 1, ukraine);
        List<Man> people = List.of(john, ben, steven);

        sortByFirstName(people);
        changeMan(people);
        showByCountry(people);
        groupByChildren(people);
        groupByChildrenAge(people);
        groupByCity(people);
        groupByCityStreet(people);
    }

    public static void showInfo(List<Man> people) {      // Вывести информацию о всех людях
        people.forEach(man -> System.out.println(man.getFirstName() + " " + man.getLastName() + " " + "Age:" +
                +man.getAge()
                + " " + "Count of children:" + man.getCountOfChildren() + " " + man.getAddress()));
    }

    public static void showAddress(List<Man> people) {
        people.stream().map(man -> man.getAddress()).forEach(address ->
                System.out.println("Country:" + address.country() + "\tCity:" + address.city()
                        + "\tStreet:" + address.street()
                        + " " + "\tNumber of home:" + address.numberOfHome()));
    }

    public static void sortByFirstName(List<Man> people) {
        people.stream()
                .filter(man -> man.getAge() >= 20)
                .sorted((man1, man2) -> man1.getLastName().compareTo(man2.getFirstName()))
                .forEach(man -> System.out.println("First name:" + man.getFirstName() +
                        "\tLast name:" + man.getLastName()
                        + "\tCount of children:" + man.getCountOfChildren()));
    }

    public static void changeMan(List<Man> people) {
        people.stream()
                .filter(man -> man.getAddress().country().equals("US")) // Измените "US" на нужную вам страну
                .peek(man -> {
                    man.setFirstName("Petr");
                    man.setLastName("Ivanov");
                    man.setCountOfChildren(7);
                }).forEach(m -> System.out.println(m));
    }

    public static void showByCountry(List<Man> people) {
        people.stream()
                .filter(man -> (man.getAddress().country().equals("Canada") &&
                        man.getAddress().numberOfHome() == 3) ||
                        man.getAge() >= 25)
                .forEach(man -> System.out.println("First name:" + man.getFirstName() + "\tLast name:" + man.getLastName()
                        + "\tStreet:" + man.getAddress().street()));
    }

    public static void groupByChildren(List<Man> people) {
        people.stream()
                .collect(Collectors.groupingBy(man -> man.getCountOfChildren()))
                .forEach((count, group) -> {
                    System.out.println("Количество детей: " + count);
                    group.forEach(man -> System.out.println("First name:" + man.getFirstName() + "\tlast name:"
                            + man.getLastName()));
                });
    }

    public static void groupByChildrenAge(List<Man> people) {
        people.stream()
                .collect(Collectors.groupingBy(man -> man.getCountOfChildren() + man.getAge()))
                .forEach((key, group) -> {
                    System.out.println(key);
                    group.forEach(man -> System.out.println("First name:" + man.getFirstName() +
                            "\tLast name:" + man.getLastName() + "\tCount of children:" + man.getCountOfChildren() +
                            "\tAge:" + man.getAge()));
                });
    }

    public static void groupByCity(List<Man> people) {
        people.stream()
                .collect(Collectors.groupingBy(man -> man.getAddress().city()
                        + man.getAddress().street()))
                .forEach((key, group) -> {
                    System.out.println(key);
                    group.forEach(man -> System.out.println(
                            man.getAddress().street() + "\tFirst name:" + man.getFirstName()
                                    + "\tLast name:" + man.getLastName()));
                });
    }

    public static void groupByCityStreet(List<Man> people) {
        people.stream()
                .collect(Collectors.groupingBy(man -> man.getAddress().city()
                        + man.getAddress().street()))
                .forEach((key, group) -> {
                    if (group.size() == 1) {
                        System.out.println("Город и улица: " + key + "\tКоличество адресов: " + group.size());
                    }
                });
    }
}


