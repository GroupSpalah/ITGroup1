package homeworks.mihail_chursinov.hw_25_04_23;

import java.util.regex.Pattern;

/**
 * Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
 * (ххх) должен быть таким: (095), (097), (073), (067), (099), (063). Operator OR
 * Проверить, чтобы 10 - ый номер был в формате (xxx)"ххх-хх-хх".
 * Если пользователь вводит номер начинающийся на(095) или (099) ххх-хх-хх,
 * выводить в консоль "Пользователь имеет МТС номер",
 * на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
 * на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер".
 * Switch from Java 12 - https://mkyong.com/java/java-12-switch-expressions/
 */

public class PhoneNumbers {
    public static void main(String[] args) {
        String text = "(063) 333-22-22";
        String regex = "(\\(095\\)|\\(097\\)|\\(073\\)|\\(067\\)|\\(099\\)|\\(063\\))\\s\\d{3}\\W\\d{2}\\W\\d{2}";

        String[] firstElement = text.split(" ");
        String operatorCode = firstElement[0];
        System.out.println("Format operator is " + Pattern.matches(regex, text));

        String result = switch (operatorCode) {
            case "(095)", "(099)" -> "The user has an MTC number!";
            case "(097)", "(067)" -> "The user has an Kyivstar number!";
            case "(073)", "(063)" -> "The user has an Life number!";
            default -> throw new IllegalStateException("Unexpected value: " + operatorCode);
        };
        System.out.println(result);
    }
}

