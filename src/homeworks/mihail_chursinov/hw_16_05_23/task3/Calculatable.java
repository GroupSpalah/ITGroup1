package homeworks.mihail_chursinov.hw_16_05_23.task3;

/**
 * Создать интерфейс Calculatable с методом calculateSquare и default метод print, который печатает название фигуры.
 * Создать абстрактный класс Figure с полями(длина стороны, высота), который реализует интерфейс Calculatable.
 * Создать классы Triangle, Parallelogram, Romb. В классах наследниках переопределить метод calculateSquare,
 * для расчета площади. Протестировать функционал.
 */

public interface Calculatable {

    float calculatable();

    default void print() {
        System.out.println("Some figure");
    }

}
