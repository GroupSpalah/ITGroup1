package homeworks.anton_gvozdenko.hw_28_07_23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class Translator {
    public static final Path PATH = Paths.get("./ATranslator");

    private Map<String, Map<String, String>> map;

    public Translator() throws IOException {
        map = new HashMap<>();
        fillTranslator();
    }

    private void fillTranslator() throws IOException {
        Files.walkFileTree(PATH, new Visitor());
    }

    private class Visitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

            String fileName = file.toFile().getName().split("\\.txt")[0];

            List<String> lines = Files.readAllLines(file);

            Map<String, String> temp = new HashMap<>();

            for (String line : lines) {
                String[] words = line.split(":");

                temp.put(words[0], words[1]);
            }

            map.put(fileName, temp);

            return FileVisitResult.CONTINUE;
        }
    }

    public void addNewWords(String language, String wordIn, String wordOut) {

        Map<String, String> languageMap = map.get(language);

        if (languageMap != null) {
            languageMap = new HashMap<>();
            map.put(language, languageMap);
        }
        languageMap.put(wordIn, wordOut);

        System.out.println(languageMap);
    }

    public void addNewLanguage(String language) {
        Map<String, String> stringMap = map.get(language);
        if (stringMap == null) {
            stringMap = new HashMap<>();
            map.put(language, stringMap);
        }
    }


    public void isTranslationExist(String language, String word) {
        Map<String, String> translation = map.get(language);
        if (word != null) {
            translation = new HashMap<>();
            if (translation.equals(word)) {
                 map.put(language, translation);


            }
        }
    }
}























