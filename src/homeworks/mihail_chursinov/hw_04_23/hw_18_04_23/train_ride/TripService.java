package homeworks.mihail_chursinov.hw_04_23.hw_18_04_23.train_ride;

import java.util.Objects;

public class TripService {
    private Trip[] trips;

    public TripService(int size) {
        trips = new Trip[size];
    }

    public void addTrip(Trip trip) {
        for (int i = 0; i < trips.length; i++) {
            if (Objects.isNull(trips[i])) {
                trips[i] = trip;
                break;

            }

        }

    }

    public void showAllTrips() {
        for (Trip trip : trips) {
            if (Objects.nonNull(trip)) {
                trip.view();
            }

        }
    }

    public void departmentCity(City departureCity) {
        for (Trip trip : trips) {
            if (Objects.nonNull(trip) && trip.getDepartureCity().equals(departureCity)) {
                trip.view();
            }

        }
    }

    public void arriveCity(City arriveCity) {
        for (Trip trip : trips) {
            if (Objects.nonNull(trip) && trip.getArriveCity().equals(arriveCity)) {
                trip.view();
            }

        }
    }

    public void searchFlightByName(String name) {
        for (Trip trip : trips) {
            if (Objects.nonNull(trip) && trip.getName().equals(name)) {
                trip.view();
            }

        }
    }

    public void searchForClassComfort(ClassComfort classComfort) {
        for (Trip trip : trips) {
            if (Objects.nonNull(trip) && trip.getClassComfort().equals(classComfort)) {
                trip.view();
            }

        }
    }
}

