package homeworks.mihail_chursinov.hw_08_23.hw_08_08_23;

import java.util.Map;
import java.util.Objects;

public class Encryption {
    public static void main(String[] args) {
        encrypt("мама");
    }

    public static void encrypt(String word) {
        Map<String, String> map = Map.of(
                "м", "755742",
                "а", "760128350201"
        );
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(i, i + 1);
            String value = map.get(key);

            if (Objects.nonNull(value)) {
                encryptedText.append(value);
            } else {
               encryptedText.append(key);
            }
        }
        System.out.println(encryptedText);
    }
}
