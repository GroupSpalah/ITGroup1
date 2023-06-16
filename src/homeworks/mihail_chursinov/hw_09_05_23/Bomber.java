package homeworks.mihail_chursinov.hw_09_05_23;

/**
 * Создать также класс наследник Бомбардировщик, в котором переопределить метод «Стоимость»,
 * * который вернет удвоенную стоимость
 * * относительно формулы для класса Самолет.
 */

public class Bomber extends Plane {

    public static final int DOUBLE_PRICE = 2;

    public Bomber(String brand, String model, int maxSpeed, int maxHeight) {
        super(brand, model, maxSpeed, maxHeight);
    }

    @Override
    public int countPrice() {
        return super.countPrice() * DOUBLE_PRICE;
    }
}
