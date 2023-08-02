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

    public void addWord(String rus_eng, String source, String target) {

        if (map.containsKey(rus_eng)) {
            Map<String, String> temp = map.get(rus_eng);
            if ((!source.isEmpty() && !target.isEmpty() && (source != null && target != null))) {
                temp.put(source, target);
            }
        }
    }
    public void addLanguage(String language, String source, String target) {

        if (!map.containsKey(language)) {
           map.put(language, new HashMap<>());
            Map<String, String> temp = map.get(language);
            if ((!source.isEmpty() && !target.isEmpty() && (source != null && target != null))) {
                temp.put(source, target);
            }
        }
    }

    public void stop() {

    }
}


