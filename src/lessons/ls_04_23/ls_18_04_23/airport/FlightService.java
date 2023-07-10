package lessons.ls_04_23.ls_18_04_23.airport;

import java.util.Objects;

public class FlightService {
    private Flight[] flights;

    public FlightService(int size) {
        flights = new Flight[size];
    }

    public void addFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (Objects.isNull(flights[i])) {
                flights[i] = flight;
                break;
            }
        }
    }

    public void searchFlightByName(String name) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) && flight.getName().equals(name)) {
                flight.view();
            }
        }
    }

    public void smartSearch(String name, float time, City arrivalCity, City departureCity, int countSeats) {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight) &&
                    flight.getName().equals(name) &&
                    flight.getArrivalCity() == arrivalCity &&
                    flight.getDepartureCity() == departureCity &&
                    flight.getCountSeats() == countSeats &&
                    flight.getTime() == time) {
                flight.view();
            }
        }
    }

    public void showAllFlights() {
        for (Flight flight : flights) {
            if (Objects.nonNull(flight)) {
                flight.view();
            }
        }
    }
}
