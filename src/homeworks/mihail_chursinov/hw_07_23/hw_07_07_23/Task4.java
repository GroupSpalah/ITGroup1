package homeworks.mihail_chursinov.hw_07_23.hw_07_07_23;

import java.util.ArrayList;
import java.util.List;

/**
 * Есть Лист со строками
 *    Допустим 3 строки - "qwe" "qsd" "qxc"
 *    Нам нужно в этом листе, не создавая новый лист, заменить букву q на букву i например
 */

public class Task4 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(List.of("qwe", "qsd", "qxc"));
        for (int i = 0; i < lines.size(); i++) {
            String elements = lines.get(i);
            String result = elements.replace("q","i");
            lines.set(i, result);

        }

        System.out.println(lines);
    }
}
