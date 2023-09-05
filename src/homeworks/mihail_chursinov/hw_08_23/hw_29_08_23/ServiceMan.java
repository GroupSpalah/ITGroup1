package homeworks.mihail_chursinov.hw_08_23.hw_29_08_23;

import java.util.LinkedList;

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

    public void showAllAddress(LinkedList<Address> address) {
        address
                .stream()
                .forEach(a -> System.out.println(a));

    }
//    public void showInfoWhenAgeMore(LinkedList<Address> address ) {
//        address
//                .stream()
//                .filter(m -> m.)
//                .forEach(a -> System.out.println(a));
//
//    }
}
