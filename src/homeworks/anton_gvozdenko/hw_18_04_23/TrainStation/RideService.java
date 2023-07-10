package homeworks.anton_gvozdenko.hw_18_04_23.TrainStation;

import java.util.Objects;

public class RideService {
    private Ride[] rides;

    public RideService(int size) {
        rides = new Ride[size];

    }

    public void addRide(Ride ride) {
        for (int i = 0; i < rides.length; i++) {
            if (Objects.isNull(rides[i])) {
                rides[i] = ride;
                break;
            }
        }
    }

    public void searchRideByArrivalCity(Cities cityOfArrive) {
        for (Ride ride : rides) {
            if ((Objects.nonNull(ride) &&
                    ride.getCityOfArrive().equals(cityOfArrive))) {
                ride.view();
            }
        }
    }

    public void searchByDepartureCity(Cities cityOfDepart) {
        for (Ride ride : rides) {
            if (Objects.nonNull(ride) &&
                    ride.getCityOfDepart().equals(cityOfDepart)) {
                ride.view();
            }
        }
    }


    public void searchRideByName(String name, float tripTime) {
        for (Ride ride : rides) {
            if (Objects.nonNull(ride) && ride.getName().equals(name) &&
                    ride.getTripTime() == tripTime) {
                ride.view();
            }
        }
    }

    public void showComfort(boolean comfort) {
        for (Ride ride : rides) {
            if (Objects.nonNull(ride) && ride.getComfort().equals(comfort)) {
                ride.view();

            }
        }
    }

    public void showAllRides() {
        for (Ride ride : rides) {
            if (Objects.nonNull(ride)) {
                ride.view();
            }
        }
    }
}