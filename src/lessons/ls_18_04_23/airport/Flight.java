package lessons.ls_18_04_23.airport;

/**
* Создать приложение, позволяющие создавать расписание аэропорта.
 * Приложение должно позволять:
 * 1) Создавать рейс.
 * 2) После ввода город прибытия выводить список подходящих рейсов.
 * 3) Просматривать все рейсы.
 * 4) Просматривать информацию о конкретном рейсе по названию.
 * 5) Организовать "умный поиск".
 * Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 * и выводить рейс, который соответствует требованиям.
 * Для полей "город отправления", "город прибытия" использовать enums.
* */
public class Flight {
    private String name;
    private City arrivalCity;
    private City departureCity;
    private float time;
    private int countSeats;

    public Flight(String name, City arrivalCity, City departureCity, float time, int countSeats) {
        this.name = name;
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.time = time;
        this.countSeats = countSeats;
    }

    public String getName() {
        return name;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public float getTime() {
        return time;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void view() {
        System.out.println("Name = " + name + "\tArrival city = " + arrivalCity);
    }
}
