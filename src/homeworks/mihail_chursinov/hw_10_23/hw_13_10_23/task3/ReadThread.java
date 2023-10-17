package homeworks.mihail_chursinov.hw_10_23.hw_13_10_23.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *  Имеется 5 потоков с именами. Необходимо им поручить задание считать один
 *       и тот же файл(Story.txt) и подсчитать сколько раз  в нем встречается слово(holidays) и вывести время,
 *       которое потратил каждый поток.
 *
 *    Использовать join  и без него.
 */

public class ReadThread extends Thread{

    public static final String FILE_PATH = "./Story.txt";
    public static final String DIRECTORY_PATH = "./Homeworks/10.23";

    @Override
    public void run() {
        Path pathToPlace = Path.of(DIRECTORY_PATH);
        Path pathToFile = pathToPlace.resolve(FILE_PATH);
        long start = System.currentTimeMillis();

        String word = "holidays";
        try {
            List<String> lines = Files.readAllLines(pathToFile);
            int count = 0;

            for (String line : lines) {
                String[] words = line.split("\\s+");
                for (String word1 : words) {
                    if (word1.equals(word)) {
                        count++;
                    }
                }
            }
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("Word: " + word + "\trepeated " + count + "\tin so many milliseconds " + time);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
