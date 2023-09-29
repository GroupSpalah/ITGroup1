package homeworks.mihail_chursinov.hw_09_23.hw_25_09_23;

import homeworks.mihail_chursinov.hw_09_23.hw_22_09_23.Rectangle;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class AdvertisementService {
    public static final String FILE_INFO = "info.dat";

    private static final List<PlaceInfo> PLACE_INFO = List.of(
            new PlaceInfo(Browser.CHROME, OS.WINDOWS),
            new PlaceInfo(Browser.FIREFOX, OS.FEDORA),
            new PlaceInfo(Browser.MOZILLA, OS.LINUX),
            new PlaceInfo(Browser.SAFARI, OS.MAC),
            new PlaceInfo(Browser.CHROME, OS.FEDORA)
    );

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


    private void createInfoFile(Path pathToDir, int index) throws IOException {
        PlaceInfo placeInfo = PLACE_INFO.get(index);
        String fileName = pathToDir.resolve(FILE_INFO).toString();
        try (FileOutputStream file = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(file)) {
            oos.writeObject(placeInfo);
        }
    }

    public void createAd(PlaceInfo placeInfo, String ad) throws IOException, ClassNotFoundException {
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get(PATH_TO_DIR))) {
            for (Path path : paths) {
                if (Files.isRegularFile(path) && path.getFileName().equals(FILE_INFO)) {
                    try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
                         ObjectInputStream ois = new ObjectInputStream(fileInputStream)) {
                        List<PlaceInfo> placeInfoList = (List<PlaceInfo>) ois.readObject();
                        if (placeInfo.equals(placeInfoList)) {
                            try (FileWriter fileWriter = new FileWriter(path.toFile(), true);
                                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                                bufferedWriter.write(ad);
                            }

                        }

                    }
                }
            }
        }
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
