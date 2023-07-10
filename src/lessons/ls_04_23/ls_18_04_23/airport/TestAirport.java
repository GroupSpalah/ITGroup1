package lessons.ls_04_23.ls_18_04_23.airport;

public class TestAirport {
    public static void main(String[] args) {
        Flight hr = new Flight("HR", City.LVIV, City.KHARKIV, 12.45f, 50);
        Flight hr1 = new Flight("WE", City.KIEV, City.KHARKIV, 2.45f, 150);
        Flight hr2 = new Flight("PO", City.LVIV, City.KIEV, 2.45f, 150);

        FlightService flightService = new FlightService(10);

        flightService.addFlight(hr);
        flightService.addFlight(hr1);
        flightService.addFlight(hr2);
flightService.searchFlightByName("HR");

        /*int[] array = {4, 7, 9};

        System.out.println(Arrays.toString(array));*/
    }
}
