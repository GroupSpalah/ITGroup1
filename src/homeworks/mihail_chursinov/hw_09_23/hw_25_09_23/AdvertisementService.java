package homeworks.mihail_chursinov.hw_09_23.hw_25_09_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class AdvertisementService {

    private static final List<PlaceInfo> PLACE_INFOS = List.of(

    );//5 PlaceInfo

    public static final String PATH_TO_DIR = "./Advertisement";

    public AdvertisementService() {
        createDefaultPlaces();
    }

    private void createDefaultPlaces() {
        IntStream
                .rangeClosed(1, 5)
                .forEach(index -> {

                    Path pathToPlace = Paths.get(PATH_TO_DIR, "Place_" + index);

                    try {
                        if (!Files.exists(pathToPlace)) {
                            Files.createDirectory(pathToPlace);
                            createDefaultScreens(pathToPlace);
                            createInfoFile(pathToPlace, index - 1);
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public void createAd(PlaceInfo placeInfo, String ad) {

    }

    private void createInfoFile(Path pathToDir, int index) {
        //get PlaceInfo by index
        //serialization
    }

    private void createDefaultScreens(Path pathToPlace) {
        IntStream
                .rangeClosed(1, 5)
                .forEach(index -> {

                    Path pathToScreen = Paths.get(pathToPlace.toString(), "Screen_" + index + ".txt");

                    try {
                        Files.createFile(pathToScreen);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                });
    }


}
