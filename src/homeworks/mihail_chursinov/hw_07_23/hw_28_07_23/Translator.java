package homeworks.mihail_chursinov.hw_07_23.hw_28_07_23;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class Translator {
    public static final Path PATH = Paths.get("./MTranslator");

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

        if (map.containsKey(language)) {
            Map<String, String> temp = map.get(language);
            if (Objects.nonNull(source) && target != null && !source.isEmpty() && !target.isEmpty()) {
                temp.put(source, target);
            }
        }
    }

    public void addLanguage(String language, String source, String target) {

        if (!map.containsKey(language)) {
            map.put(language, new HashMap<>());
            Map<String, String> temp = map.get(language);
            if (source != null && target != null && !source.isEmpty() && !target.isEmpty()) {
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

    public void stop() {

    }
}


