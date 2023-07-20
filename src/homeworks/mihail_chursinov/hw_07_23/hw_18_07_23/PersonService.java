package homeworks.mihail_chursinov.hw_07_23.hw_18_07_23;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 2) В Map<Person, Position>(Person(поля - firstName, age) и Position(поля - name) отдельные классы(records))
 * вывести на печать(в отдельных методах):
 * - всех Person, у которых вовзраст больше 30, но меньше 50.
 * - всех Person, у которых имя больше 3 символов по длине.
 * - всех Person, у которых название Position больше 3 символов по длине.
 * - всех Person, у которых название Position "Automation".
 */

public class PersonService {
    public void showAge(Map<Person, Position> map) {
        Set<Map.Entry<Person, Position>> entries = map.entrySet();
        for (Map.Entry<Person, Position> entry : entries) {
            if (entry.getKey().age() > 30 && entry.getKey().age() < 50) {
                System.out.println(entry);
            }
        }
    }

    public void showLengthOfTheName(Map<Person, Position> map) {
        Set<Map.Entry<Person, Position>> entries = map.entrySet();
        for (Map.Entry<Person, Position> entry : entries) {
            if (entry.getKey().firstName().length() > 3) {
                System.out.println(entry);
            }
        }
    }

    public void showLengthOfThePosition(Map<Person, Position> map) {
        Set<Map.Entry<Person, Position>> entries = map.entrySet();
        for (Map.Entry<Person, Position> entry : entries) {
            if (entry.getKey().position().name().length() > 3) {
                System.out.println(entry);
            }
        }
    }

    public void showLengthOfTheNamePosition(Map<Person, Position> map) {
        Set<Map.Entry<Person, Position>> entries = map.entrySet();
        for (Map.Entry<Person, Position> entry : entries) {
            if (Objects.equals(entry.getKey().position().name(), "Automation")) {
                System.out.println(entry);
            }
        }
    }
}
