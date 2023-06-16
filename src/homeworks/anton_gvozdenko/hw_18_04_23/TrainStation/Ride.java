package homeworks.anton_gvozdenko.hw_18_04_23.TrainStation;

public class Ride {
    private String name;
    private int sumOfRailwayCarriages;
    private Comfort comfort;
    private Cities cityOfArrive;
    private Cities cityOfDepart;
    private float tripTime;
    private boolean speed;


    public Ride(String name, int sumOfRailwayCarriages, Comfort comfort, Cities cityOfArrive, Cities cityOfDepart, float tripTime, boolean speed) {
        this.name = name;
        this.sumOfRailwayCarriages = sumOfRailwayCarriages;
        this.comfort = comfort;
        this.cityOfArrive = cityOfArrive;
        this.cityOfDepart = cityOfDepart;
        this.tripTime = tripTime;
        this.speed = speed;
    }


    public String getName() {
        return name;
    }

    public int getSumOfRailwayCarriages() {
        return sumOfRailwayCarriages;
    }

    public Comfort getComfort() {
        return comfort;
    }

    public Cities getCityOfArrive() {
        return cityOfArrive;
    }

    public Cities getCityOfDepart() {
        return cityOfDepart;
    }

    public float getTripTime() {
        return tripTime;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void view() {
        System.out.println();

        System.out.println("\tArrival city = " + cityOfArrive);
        System.out.println("Departure city = " + cityOfDepart);

        System.out.print("Name = +" + name + cityOfDepart + cityOfArrive + tripTime + speed);


    }
}