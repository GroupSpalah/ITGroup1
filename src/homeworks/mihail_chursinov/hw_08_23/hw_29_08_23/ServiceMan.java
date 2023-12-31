package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * * - Вывести информацию о всех людях.
 * * - Вывести информацию о всех адресах.
 * * - Вывести firstName, lastName, countOfChildren, когда возраст более или равно 20 и отсортировать по firstName.
 * * - Изменить firstName = 'John', lastName = 'Kennedi', countOfChildren = 3, когда country == 'US' (or another country).
 * * - Вывести firstName, lastName, nameOfStreet, когда country == 'Canada' AND numberOfHome == 3 OR age >= 25";
 * * - Сгруппировать людей по количеству детей.
 * * - Сгруппировать людей по количеству детей и возрасту.
 * * - Сгруппировать людей по городу и названию улицы.
 * * - Сгруппировать людей по городу и названию улицы и вывести количество адресов, где количество людей больше 4.
 */
public class ServiceMan {
    public void showInfoAllMan(LinkedList<Man> men) {
        men
                .stream()
                .forEach(man -> System.out.println(man));

    }

    public void showAllAddress(LinkedList<Man> address) {
        address
                .stream()
                .forEach(a -> System.out.println("Country :" + a.getAddress().country() + "\t" +
                        "City :" + a.getAddress().city() + "\t" + "Street :" + a.getAddress().street() +
                        "\t" + "House of street :" + a.getAddress().houseStreet()));

    }

    public void showInfoWhenAgeMoreTwenty(LinkedList<Man> people) {
        people
                .stream()
                .filter(m -> m.getAge() >= 20)
                .sorted()
                .forEach(m -> System.out.println("First name :" + m.getFirstName() + "\t" + "Last Name :" +
                        m.getLastName() + "\t" + "Count of children :" + m.getCountOfChildren()));

    }

    public void changeMan(LinkedList<Man> people) {
        people
                .stream()
                .filter(m -> m.getAddress().country().equals("USA"))
                .peek(m -> {
                    m.setFirstName("John");
                    m.setLastName("Kennedi");
                    m.setCountOfChildren(3);
                })
                .forEach(m -> System.out.println(m));
    }

    public void showInfoWhenCountryUK(LinkedList<Man> people) {
        people
                .stream()
                .filter(m -> m.getAddress().country().equals("UK") && m.getAddress().houseStreet() == 5 ||
                        m.getAge() >= 25)
                .sorted()
                .forEach(m -> System.out.println("First name :" + m.getFirstName() + "\t" + "Last Name :" + m.getLastName()
                        + "\t" + "Name of street :" + m.getAddress().street()));

    }

    public void groupingAmountOfChildren(LinkedList<Man> people) {
        Map<Integer, Long> men = people
                .stream()
                .collect(Collectors.groupingBy(m -> m.getCountOfChildren(), Collectors.counting()));
        System.out.println(men);
    }

    public void groupingAmountOfChildrenAge(LinkedList<Man> people) {
        Map<Man, List<Man>> map = people
                .stream()
                .collect(Collectors.groupingBy(m -> new Man(m.getAddress().country(), m.getAddress().street())));
        System.out.println();
    }

    public void groupingAmountOfCity(LinkedList<Man> people) {
        Map<Address, List<Man>> map = people
                .stream()
                .collect(Collectors.groupingBy(m -> new Address(m.getAddress().country(), m.getAddress().street())));
        System.out.println(map);
    }

    public void groupingAmountOfCityWithAddress(LinkedList<Man> people) {
        Map<Address, List<Man>> map = people
                .stream()
                .collect(Collectors.groupingBy(m -> new Address(m.getAddress().country(), m.getAddress().street())));
        map
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 4)
                .forEach(m -> System.out.println(m));
    }
}
