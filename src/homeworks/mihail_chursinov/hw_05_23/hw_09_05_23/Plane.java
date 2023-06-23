package homeworks.mihail_chursinov.hw_05_23.hw_09_05_23;

/**
 * Создать класс Самолет со свойствами: Марка, Модель, Максимальная
 * скорость (в км/ч), Максимальная высота (в метрах). Определить метод «Стоимость» – стоимость самолета, рассчитываемую по
 * формуле Максимальная скорость * 1000 + Максимальная высота * 100
 * Определить также метод «Информация», который возвращает строку,
 * содержащую информацию об объекте: Марка, Модель, Максимальную
 * скорость, Максимальную высоту и Стоимость.
 * Создать также класс наследник Бомбардировщик, в котором переопределить метод «Стоимость»,
 * который вернет удвоенную стоимость
 * относительно формулы для класса Самолет. Также создать класс Истребитель –
 * наследник класса Самолет, для которого переопределить
 * метод «Стоимость» как утроенную стоимость, относительно формулы
 * стоимости для Самолета.
 * В главной программе  создать объект
 * класса Самолет, класса Бомбардировщик, класса Истребитель. Вывести на экран информацию о самолетах
 */

public class Plane {
    public static final int CONST_SPEED = 1000;
    public static final int CONST_HEIGHT = 100;
    private String brand;
    private String model;
    private int maxSpeed;
    private int maxHeight;

    public Plane(String brand, String model, int maxSpeed, int maxHeight) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
    }

    public int countPrice() {
        return maxSpeed * CONST_SPEED + maxHeight * CONST_HEIGHT;
    }

    public String showInfo() {
        return "Brand " + brand + "\tModel " + model + "\tMaximum speed " + maxSpeed + "\tMaximum height "
                + maxHeight + "\tThe price of the plane " + countPrice();
    }
}

