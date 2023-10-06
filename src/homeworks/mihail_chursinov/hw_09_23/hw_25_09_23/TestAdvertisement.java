package homeworks.mihail_chursinov.hw_09_23.hw_25_09_23;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestAdvertisement {
    public static void main(String[] args) throws IOException {
        new AdvertisementService();
        AdvertisementService advertisementService = new AdvertisementService();
        Path path = Paths.get("./Advertisement/Place_1");

//        try {
//            advertisementService.createAd(new PlaceInfo(Browser.CHROME, OS.FEDORA), "Well");
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        advertisementService.addScreenToPlace(path, "write smth");
//        advertisementService.createNewPlace();
        advertisementService.deletePlace(path);

   }
}
