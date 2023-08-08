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

        if (languageMap == null) {
            languageMap = new HashMap<>();
            map.put(language, languageMap);
        }
        languageMap.put(wordIn, wordOut);


    }

    public void addNewLanguage(String language) {
        Map<String, String> stringMap = map.get(language);
        if (!map.containsKey(stringMap)) {
            stringMap = new HashMap<>();
            map.put(language, stringMap);
            if (map.containsKey(stringMap)) {
                System.out.println("Language doesn't add");
            }
        }
    }
    public boolean isTranslationExist(String language, String word) {
        if (word != null) {
            Map<String, String> translation = map.get(language);
            return translation.containsKey(word);
        }
        return false;
    }
    public void translateSentence(String sentence, String language) {
        String[] words = sentence.split("\\s+");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            if (isTranslationExist(language, word)) {
                String translatedWord = map.get(language).get(word);
                translatedSentence.append(translatedWord).append(" ");
            } else {
                System.out.println("Translation not available for sentence: " + sentence);
                return;
            }
        }
        System.out.println(translatedSentence);

    }

    public void detectLanguage(String word) {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            if (entry.getValue().containsKey(word)) {
                String key = entry.getKey();
                String[] result = key.split("_");
                System.out.println(result[0]);
            }
        }
    }
}

























