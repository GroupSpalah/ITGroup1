package homeworks.anton_gvozdenko.hw_01_08_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Encryption {

    private Map<String, String> map;

    public static void main(String[] args) {
//        new Encryption().encrypt("где почка?");
//        Encryption encryption = new Encryption();
//   encryption.encrypt("мама");
//        encryption.decryptPhrase("755742760128350201755742760128350201");
    }

    public Encryption() {
        map = new HashMap<>();
        fillMap();
    }

    private void fillMap() {
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
        map.putAll(firstMap);
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
        map.putAll(secondMap);
        map.put(" ", "751769758801849");
        map.put("?", "777");
    }

    public void encrypt(String word) {

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            String symbol = String.valueOf(word.charAt(i));

            String value = map.get(symbol);

            if (Objects.nonNull(value)) {
                encryptedText.append(value);
            }
        }
        System.out.println(encryptedText);
    }

    public void decryptPhrase(String ecryptPhrase) {
        StringBuilder result = new StringBuilder();

        decodeTest(ecryptPhrase, result);

    }

    private void decodeTest(String phrase, StringBuilder builder) {

        if (phrase.length() == 0) {
            System.out.println(builder.toString().toLowerCase());
            return;
        }

        String result = phrase.substring(0, 3);

        Map.Entry<String, String> entry = map.entrySet()
                .stream()
                .filter(e -> e.getValue().contains(result))
                .findFirst()
                .get();

        builder.append(entry.getKey());

        phrase = phrase.replaceFirst(entry.getValue(), "");

        decodeTest(phrase, builder);

    }
}













   

































