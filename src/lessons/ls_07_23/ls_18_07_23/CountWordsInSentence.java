package lessons.ls_07_23.ls_18_07_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello my young friend my friend";

        Map<String, Integer> map = new HashMap<>();

        String[] words = sentence.split(" ");

       /* for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);

                map.put(word, ++count);
            } else {
                map.put(word, 1);
            }
        }*/

        for (String word : words) {
            int count = 1;

            if (map.containsKey(word)) {
                count = map.get(word);
                ++count;
            }

            map.put(word, count);
        }

        System.out.println(map);

    }
}
