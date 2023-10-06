package homeworks.mihail_chursinov.hw_09_23.hw_25_09_23;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.IntStream;

public class AdvertisementService {

    private static final List<PlaceInfo> PLACE_INFO = List.of(
            new PlaceInfo(Browser.CHROME, OS.WINDOWS),
            new PlaceInfo(Browser.FIREFOX, OS.FEDORA),
            new PlaceInfo(Browser.MOZILLA, OS.LINUX),
            new PlaceInfo(Browser.SAFARI, OS.MAC),
            new PlaceInfo(Browser.CHROME, OS.FEDORA)
    );
    public static final String FILE_INFO = "info.dat";
    public static final String PATH_TO_DIR = "./Advertisement";
    public static final String NEW_FILE = "new.txt";
    public static final String NEW_PLACE = "new_Place";

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
        Files.newDirectoryStream(Paths.get(PATH_TO_DIR))
                .forEach(path -> {
                    Path pathToInfo = Paths.get(path.toString(), FILE_INFO);
                    PlaceInfo info = readInfo(pathToInfo);

                    if (placeInfo.equals(info)) {
                        if (path.toFile().getName().endsWith(".txt")) {
                            try {
                                Files.write(path, ad.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                });

    }

    private PlaceInfo readInfo(Path path) {
        PlaceInfo info = new PlaceInfo(Browser.UNKNOWN, OS.UNKNOWN);

        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
             ObjectInputStream ois = new ObjectInputStream(fileInputStream)) {
            info = (PlaceInfo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return info;
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

    public void addScreenToPlace(Path pathToPlace, String name) throws IOException {
        Path pathToNew = pathToPlace.resolve(NEW_FILE);
        Files.write(pathToNew, name.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }

    public void createNewPlace() {
        IntStream
                .rangeClosed(1, 1)
                .forEach(index -> {

                    Path pathToPlace = Paths.get(PATH_TO_DIR, NEW_PLACE);

                    try {
                        if (!Files.exists(pathToPlace)) {
                            Files.createDirectory(pathToPlace);
                            createDefaultScreens(pathToPlace);
                            createInfoFile(pathToPlace, -1);
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
//
//
//    public void deletePlace(Path pathToPlace) throws IOException {
//        Files.newDirectoryStream(Paths.get(PATH_TO_DIR))
//                .forEach(path -> {
//                    IntStream
//                            .rangeClosed(1, 5)
//                            .
//
//
//                });
//
//
//    }

}
