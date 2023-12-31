package homeworks.mihail_chursinov.hw_05_23.hw_06_05_23.task1;

/**
 * 1) Создать класс Автомобиль со свойствами: Название, Максимальная
 * скорость (в км/ч). Определить 2 метода: метод «иСтомость» –стоимость автомобиля,
 * рассчитываемую по формуле: Максимальная скорость * 100 и метод «Обновление модели», увеличивающий
 * максимальную скорость на 10. Определить также метод «Информация»,
 * который возвращает строку, содержащую информацию об объекте:
 * Название, Максимальную скорость и Стоимость.
 * Создать также класс наследник Представительский автомобиль, в
 * котором переопределить методы: метод «Стоимость» возвращает число,
 * равное: Максимальная скорость * 250, а метод «Обновление модели»
 * увеличивает скорость на 5 км/ч.
 * В главной программе создать объект
 * класса Автомобиль с максимальной скоростью 140 км/ч и класса
 * Представительский автомобиль с максимальной скоростью 160 км/ч.
 * Вывести на экран информацию об автомобилях. Обновить
 * модели автомобилей и снова вывести информацию о них.
 */

public class Car {
    private String name;
    private int maxSpeed;


    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int countPrice() {
        return maxSpeed * 100;
    }

    public int updateModel() {
        return maxSpeed + 10;
    }

    public String showInfo() {
        return "Name " + name + "\tMaximum speed " + maxSpeed + "\tThe price of the car " + countPrice();
    }
}
