package homeworks.mihail_chursinov.hw_22_04_23;

import java.util.regex.Pattern;

/**
 * 3) Пользователь вводит имя и фамилию в одной переменной, разделение пробелом. "АнДреЙ ВаЛевский"
 * Буквы могут быть в разных регистрах.
 * Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
 */

public class RegexTask3 {
    public static void main(String[] args) {
        String text = "Mykhailo Chursinov";
        String regex = "[A-Z]?[a-z]+\\s[A-Z]?[a-z]+";

        System.out.println(Pattern.matches(regex, text));
    }
}
