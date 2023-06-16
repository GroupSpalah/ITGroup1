package homeworks.mihail_chursinov.hw_18_04_23.train_ride;

/**
 * Организовать приложение касса вокзала.
 * Приложение должно позволять:
 * 1) Создавать рейс(количество вагонов, класс удобства(использовать enum),
 * город отбытия/прибытия(использовать enum), время в пути, скоростной/нескоростной(boolean)).
 * 2) Выводить список всех рейсов.
 * 3) Выводить список рейсов по городу отбытия/прибытия.
 * 4) Просматривать отдельный рейс по названию.
 * 5) Выводить рейсы, у которых вагоны типа люкс/эконом.
 */
public class Trip {
    private String name;
    private City departureCity;
    private City arriveCity;
    private int countWagons;
    private ClassComfort classComfort;
    private float time;
    private boolean isSpeed;


    public Trip(String name, City arriveCity, City departureCity, int countWagons,
                ClassComfort classComfort, float time, boolean isSpeed) {
        this.name = name;
        this.arriveCity = arriveCity;
        this.departureCity = departureCity;
        this.countWagons = countWagons;
        this.classComfort = classComfort;
        this.time = time;
        this.isSpeed = isSpeed;

    }

    public String getName() {
        return name;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public City getArriveCity() {
        return arriveCity;
    }

    public ClassComfort getClassComfort() {
        return classComfort;
    }

    public void view() {
        System.out.println("Name: " + name + "\tCity of departure: " + departureCity + "\tCity of arrive: " + arriveCity +
                "\tNumber of wagons: " + countWagons + "\tComfort of wagons: " + classComfort + "\tTime: " + time +
                "\tHigh-speed train flight: " + isSpeed);

    }
}
