package homeworks.mihail_chursinov.hw_05_23.hw_09_05_23;

/**
 *  * Также создать класс Истребитель –
 *  * наследник класса Самолет, для которого переопределить
 *  * метод «Стоимость» как утроенную стоимость, относительно формулы
 *  * стоимости для Самолета.
 */

public class Destroyer extends Plane{

    public static final int TRIPLE_PRICE = 3;

    public Destroyer(String brand, String model, int maxSpeed, int maxHeight) {
        super(brand, model, maxSpeed, maxHeight);
    }

    @Override
    public int countPrice() {
        return super.countPrice() * TRIPLE_PRICE;
    }
}
