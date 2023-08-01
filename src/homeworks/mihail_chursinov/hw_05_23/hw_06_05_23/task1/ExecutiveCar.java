package homeworks.mihail_chursinov.hw_05_23.hw_06_05_23.task1;

/**
 * Создать также класс наследник Представительский автомобиль, в
 * * котором переопределить методы: метод «Стоимость» возвращает число,
 * * равное: Максимальная скорость * 250, а метод «Обновление модели»
 * * увеличивает скорость на 5 км/ч.
 */

public class ExecutiveCar extends Car {

    public static final int CONST_EXECUTIVE = 250;
    public static final int CONST_CAR_MODEL = 5;

    public ExecutiveCar(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public int countPrice() {
        return super.countPrice() * CONST_EXECUTIVE;
    }

    @Override
    public int updateModel() {
        return super.updateModel() + CONST_CAR_MODEL;
    }
}
