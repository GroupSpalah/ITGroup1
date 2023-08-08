package homeworks.anton_gvozdenko.hw_28_07_23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class Translator {
    public static final Path PATH = Paths.get("./ATranslator");
    public static final String EXTENSION_TXT = ".txt";

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
        if (!map.containsKey(language)) {
            map.put(language, new HashMap<>());
        } else {
            System.out.println("Language doesn't add");
        }
    }
    private boolean isTranslationExist(String language, String word) {
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

    public void stop() throws IOException {
        Files.walkFileTree(PATH, new DeleteVisitor());
        saveTranslator();
    }

    private void saveTranslator() throws IOException {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            String fileName = entry.getKey().concat(EXTENSION_TXT);
            Path pathToFile = Paths.get(PATH.toString(), fileName);

            Set<Map.Entry<String, String>> words = entry.getValue().entrySet();

            Set<String> temp = new HashSet<>();

            for (Map.Entry<String, String> pair : words) {
                String key = pair.getKey();
                String value = pair.getValue();

                temp.add(key.concat(":").concat(value));
            }

            Files.write(pathToFile, temp, StandardOpenOption.CREATE);
        }
    }

    private class DeleteVisitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.delete(file);
            return FileVisitResult.CONTINUE;
        }
    }
}




























