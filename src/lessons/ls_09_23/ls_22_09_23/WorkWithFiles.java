package lessons.ls_09_23.ls_22_09_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

        Path pathToDir = Paths.get("");

        Files
                .newDirectoryStream(pathToDir)
                .forEach(path -> System.out.println(path));

        for (int i = 0; i < 5; i++) {

        }

        IntStream
                .rangeClosed(1, 5)
                .forEach(index -> System.out.println("Place_" + index));
    }
}

/**
 * PlaceInfo {
 *     Browser,
 *     OS
 * }
 *
 * AdvertisementService
 * List<PlaceInfo> = {
 *     new PlaceInfo(Windows, Chrome)
 *     new PlaceInfo(Mac, Opera)
 *     new PlaceInfo(Linux, Safari)
 * };
 */
