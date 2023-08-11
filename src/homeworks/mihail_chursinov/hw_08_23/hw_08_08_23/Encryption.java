package homeworks.mihail_chursinov.hw_08_23.hw_08_08_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Encryption {
    public static void main(String[] args) {
        encrypt("где почва?");
    }

    public static void encrypt(String word) {
        Map<String, String> firstMap = Map.of(
                "а", "760128350201",
                "б", "101",
                "в", "210106",
                "г", "351",
                "д", "129",
                "е", "761130802352",
                "ж", "102",
                "з", "753",
                "и", "762211131",
                "к", "754764"
        );
        Map<String, String> secondMap = new HashMap<>(Map.of(
                "л", "132354",
                "м", "755742",
                "н", "763756212",
                "о", "757213765733353",
                "п", "743766",
                "р", "134532",
                "с", "800767105",
                "т", "759135214",
                "у", "544",
                "ф", "560"
        ));
        secondMap.putAll(firstMap);
        Map<String, String> thirdMap = new HashMap<>(Map.of(
                "х", "768",
                "ц", "545",
                "ч", "215",
                "ш", "103",
                "щ", "752",
                "ы", "136",
                "ь", "562",
                "э", "750",
                "ю", "570",
                "я", "216104"
        ));
        thirdMap.putAll(secondMap);
        thirdMap.put(" ", "751769758801849");
        thirdMap.put("?", "777");


        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(i, i + 1);
            String value = thirdMap.get(key);

            if (Objects.nonNull(value)) {
                encryptedText.append(value);
            }
        }
        System.out.println(encryptedText);
    }
}
