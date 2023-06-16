package homeworks.anton_gvozdenko.hw_18_04_23.TrainStation;



public class TestTrainStation {
    public static void main(String[] args) {

               Ride east = new Ride("East way", 4 , Comfort.LUXURY ,  Cities.DNIPRO , Cities.ODESSA , 1 , true);
                Ride west = new Ride("West Journey" ,1 , Comfort.ECONOMY , Cities.CHERKASY , Cities.DNIPRO , 2 , false);
                Ride north = new Ride("North Passenger" ,3 , Comfort.LUXURY , Cities.CHERKASY , Cities.ODESSA , 3 ,true);

                RideService service = new RideService(5);

                service.addRide(east);
                service.addRide(west);
                service.addRide(north);
                service.showAllRides();



    }
}
