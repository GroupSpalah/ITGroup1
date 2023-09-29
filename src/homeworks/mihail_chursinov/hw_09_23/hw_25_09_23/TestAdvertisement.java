package homeworks.mihail_chursinov.hw_09_23.hw_25_09_23;

import java.io.IOException;

public class TestAdvertisement {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new AdvertisementService();
        AdvertisementService advertisementService = new AdvertisementService();
        advertisementService.createAd(new PlaceInfo(Browser.CHROME, OS.FEDORA), "Hello");
    }

}
