package homeworks.anton_gvozdenko.hw_16_05_23.figures;

public interface Calculatable {
    double calculateSquare();

    default void print() {
        System.out.println("Figure");
    }
}
