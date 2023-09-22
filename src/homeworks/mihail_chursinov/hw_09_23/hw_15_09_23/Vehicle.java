package homeworks.mihail_chursinov.hw_09_23.hw_15_09_23;

import java.time.LocalDate;

/**
 * 2) Общественный транспорт
 * Наша цель — перестроить и оцифровать систему управления общественным транспортом в нашем городе.
 * <p>
 * Первым шагом является создание инвентаризации всех транспортных средств на складе. Все транспортные средства
 * имеют внутренний уникальный идентификатор, номерной знак, максимальное количество пассажиров,
 * статус (требует ремонта / в эксплуатации / в утиль), тип топлива (электрический, газовый или гибридный)
 * и дату последнего обслуживания. В целом статус дается по времени последнего обслуживания
 * (0-6 месяцев «в эксплуатации», 7-36 «требует ремонта», 37+ «лом»). Каждый тип транспортного
 * средства имеет некоторые дополнительные характеристики:
 * <p>
 * Все автобусы работают на газе и имеют индикатор загрязнения. Автобус находится «в эксплуатации»,
 * если последний срок обслуживания был 0-6 месяцев назад и его показатель загрязнения выше 5;
 * «требует ремонта», если дата обслуживания была 0-12 месяцев назад и показатель загрязнения между
 * 3 и 5, и «в утиль» в противном случае.
 * Троллейбусы имеют как электрический, так и газовый двигатель (гибрид).
 * Все трамваи электрические и хранят количество лет эксплуатации.
 * <p>
 * Первая цель Службы общественного транспорта — выяснить, сколько транспортных средств определенного типа имеют
 * особый статус.
 * <p>
 * Следующий шаг в цифровизации — отслеживание маршрутов. Маршрут описывается двумя или более станциями,
 * и список транспортных средств, которые на нем работают. Помните, что маршрут может быть назначен
 * только транспортным средствам, находящимся в эксплуатации.
 * Каждая станция имеет название.
 */

public class Vehicle {
    private int id;
    private int number;
    private int licensePlate;
    private int maximumNumberPassengers;
    private Status status;
    private Fuel fuel;
    private LocalDate dateService;
    private Station station;

    public static int counterIds = 1;

    public Vehicle(int id, int number, int licensePlate, int maximumNumberPassengers, Status status, Fuel fuel,
                   LocalDate dateService, Station station) {
        this.id = id;
        this.number = number;
        this.licensePlate = licensePlate;
        this.maximumNumberPassengers = maximumNumberPassengers;
        this.status = status;
        this.fuel = fuel;
        this.dateService = dateService;
        this.station = station;
    }

    public Vehicle(int number, int licensePlate, int maximumNumberPassengers,
                   Status status, Fuel fuel, LocalDate dateService, Station station) {
        this.id = counterIds++;
        this.number = number;
        this.licensePlate = licensePlate;
        this.maximumNumberPassengers = maximumNumberPassengers;
        this.status = status;
        this.fuel = fuel;
        this.dateService = dateService;
        this.station = station;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public Status getStatus() {
        return status;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public LocalDate getDateService() {
        return dateService;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
