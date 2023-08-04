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

public class Main {
    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();
        translator.addWord("rus_eng", "Ночь", "Night");
        translator.addLanguage("de_ukr", "Hallo", "Привіт");
        boolean word = translator.checkTranslation("Привіт","ukr_rus");
        System.out.println(word);

    }
}
