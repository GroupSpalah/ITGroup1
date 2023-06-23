package homeworks.mihail_chursinov.hw_04_23.hw_18_04_23.train_ride;

public class TestTrip {
    public static void main(String[] args) {
        Trip kl = new Trip("KL", City.KIYV, City.LVIV, 20, ClassComfort.LUX, 9.15f, true);
        Trip ok = new Trip("OK", City.ODESA, City.KIYV, 18, ClassComfort.LUX, 12.00f, true);
        Trip lo = new Trip("LO", City.LVIV, City.ODESA, 21, ClassComfort.ECONOMY, 8.15f, false);

        TripService tripService = new TripService(3);

        tripService.addTrip(kl);
        tripService.addTrip(ok);
        tripService.addTrip(lo);

        tripService.showAllTrips();
        tripService.departmentCity(City.KIYV);
        tripService.arriveCity(City.KIYV);
        tripService.searchFlightByName("LO");
        tripService.searchForClassComfort(ClassComfort.ECONOMY);

    }
}
