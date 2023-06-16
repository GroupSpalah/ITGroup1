package lessons.inheritance.ls_29_04_23.vehicle;

/**
 * Автомобили. Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и
 * Driver в пакете com.company.professions.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 *
 * Класс Engine содержит поля - мощность, производитель.
 *
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес,
 * водитель типа Driver, мотор типа Engine. Методы start(), stop(),
 * turnRight(), turnLeft(), которые выводят на печать: "Поехали",
 * "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод
 * view(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 *
 * Создать производный от Car класс - Lorry (грузовик), характеризуемый
 * также грузоподъемностью кузова. Создать производный от Car класс -
 * SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.
 */

public class TestVehicle {
    public static void main(String[] args) {
        Driver driver = new Driver("lastNameD", "firstNameD", "middleNameD", 30, 10);
        Engine engine = new Engine(1200, "BMW");

        Lorry lorry = new Lorry("X5", 1000, driver, engine, 12.5f);


    }
}
