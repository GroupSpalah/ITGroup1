package homeworks.mihail_chursinov.hw_07_23.hw_07_07_23;

import java.util.List;

/**
 * Есть Лист со строками
 *    Допустим 3 строки - "qwe" "qsd" "qxc"
 *    Нам нужно в этом листе, не создавая новый лист, заменить букву q на букву i например
 */

public class Task4 {
    public static void main(String[] args) {
        List<String> lines = List.of("qwe","qsd", "qxc");

        for (String line : lines) {
            if (line.startsWith("q")) {
                String result = line.replace("q","i");
                System.out.println(result);
            }
        }

        System.out.println(lines);
    }
}
