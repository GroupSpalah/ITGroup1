package lessons.inheritance.figures;

/**
 * Создать интерфейс Calculatable с методом calculateSquare и default метод print, который печатает название фигуры.
 * Создать абстрактный класс Figure с полями(длина стороны, высота), который реализует интерфейс Calculatable.
 * Создать классы Triangle, Parallelogram, Romb. В классах наследниках переопределить метод calculateSquare,
 * для расчета площади. Протестировать функционал.
 */
public interface Calculatable {
    public abstract float calculatorSquare();

    default void print() {
        System.out.println("Some figure");
    }
}

abstract class Figure implements Calculatable {
    private float side1;
    private float side2;

    public Figure(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}

class Triangle extends Figure {

    public Triangle(float side1, float side2) {
        super(side1, side2);
    }

    @Override
    public float calculatorSquare() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Triangle");
    }
}
