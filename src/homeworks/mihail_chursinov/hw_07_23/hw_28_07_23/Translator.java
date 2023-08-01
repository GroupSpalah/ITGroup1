package homeworks.mihail_chursinov.hw_07_23.hw_28_07_23;
/**
 * Создать приложение переводчик.
 * <p>
 * Приложение должно позволять:
 * - добавлять новые слова.
 * - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский,
 * Английский - Русский, Русский - Английский).
 * - после слова ввода определять язык, на котором ввел юзер
 * - добавлять новые языки
 * - Написать метод который определяет есть ли в словаре перевод для данного слова
 * - В методе перевода предложения написать логику что если хотя бы нет перевода одного слова из
 * предложения то не переводить все предложение
 * <p>
 * После остановки программы сохранять словари в файлах и после запуска наполнять словари.
 * <p>
 * *    Map<String, Map<String, String>> -> Map<rus_eng, Map<Привет, Hello; Утро:Morning>>
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Translator {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("./MTranslator/eng_rus");
        Path pathToFile1 = Paths.get("./MTranslator/rus_eng");
        Path pathToFile2 = Paths.get("./MTranslator/rus_ukr");
        Path pathToFile3 = Paths.get("./MTranslator/ukr_rus");

        byte[] bytes = Files.readAllBytes(pathToFile);
        byte[] bytes1 = Files.readAllBytes(pathToFile1);
        byte[] bytes2 = Files.readAllBytes(pathToFile2);
        byte[] bytes3 = Files.readAllBytes(pathToFile3);

        String eng_rus = new String(bytes);
        String rus_eng = new String(bytes1);
        String rus_ukr = new String(bytes2);
        String ukr_rus = new String(bytes3);

        Map<String, Map<String, String>> result = createMapFromText(eng_rus);
        System.out.println(result);

    }
    private static Map<String, Map<String, String>> createMapFromText(String content) {
        Map<String, Map<String, String>> map = new HashMap<>();

        String[] lines = content.split("\n");

        Map<String, String> temp = new HashMap<>();
        for (String line : lines) {
            String[] keyValue = line.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0];
                String value = keyValue[1];

                temp.put(key, value);
            }
        }
        map.put("eng_rus", temp);

        return map;
    }
}
