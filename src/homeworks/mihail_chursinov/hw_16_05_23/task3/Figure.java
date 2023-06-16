package homeworks.mihail_chursinov.hw_16_05_23.task3;

/**
 * Создать абстрактный класс Figure с полями(длина стороны, высота), который реализует интерфейс Calculatable.
 */

abstract public class Figure implements Calculatable {
    private float side;
    private float height;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public Figure(float side, float height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public float calculatable() {
        return height * side;
    }

}
