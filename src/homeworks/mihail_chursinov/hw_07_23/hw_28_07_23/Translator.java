package homeworks.mihail_chursinov.hw_07_23.hw_28_07_23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class Translator {
    public static final Path PATH = Paths.get("./MTranslator");
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

    public void addWord(String language, String source, String target) {
        if (Objects.nonNull(source) && Objects.nonNull(target) && !source.isEmpty() && !target.isEmpty()) {
            if (map.containsKey(language)) {
                Map<String, String> temp = map.get(language);
                temp.put(source, target);
            }
        }
    }

    public void addLanguage(String language, String source, String target) {
        if (Objects.nonNull(source) && Objects.nonNull(target) && !source.isEmpty() && !target.isEmpty()) {
            if (!map.containsKey(language)) {
                map.put(language, new HashMap<>());
                Map<String, String> temp = map.get(language);
                temp.put(source, target);
            }
        }
    }

    public boolean checkTranslation(String language, String word) {
        if (map.containsKey(language)) {
            Map<String, String> translation = map.get(language);
            return translation.containsKey(word);
        }
        return false;
    }

    public void translateSentence(String sentence, String language) {
        String[] words = sentence.split(" ");
        StringBuilder translatedSentence = new StringBuilder();

        for (String word : words) {
            if (checkTranslation(word, language)) {
                String translation = map.get(language).get(word);
                translatedSentence.append(translation).append(" ");
            } else {
                System.out.println(sentence);
                return;
            }
        }
    }

    public void determineLanguage(String word) {
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            if (entry.getValue().containsKey(word)) {
                String key = entry.getKey();
                String[] words = key.split("_");
                System.out.println(words[0]);
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


