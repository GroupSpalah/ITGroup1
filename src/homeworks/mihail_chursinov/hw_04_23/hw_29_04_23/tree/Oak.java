package homeworks.mihail_chursinov.hw_04_23.hw_29_04_23.tree;

/**
 * 1. Создать классы Oak(поля - возраст, рост, разновидность дуба) и Maple(поля - возраст, рост, разновидность клена).
 * Создать класс Tree(super-class) и вынести общие поля в родительский класс. Создать конструкторы во всех классах.
 * Создать объекты потомков.
 */

public class Oak extends Tree {
    private String varietyOak;

    public Oak(int age, float high, String varietyOak) {
        super(age, high);
        this.varietyOak = varietyOak;
    }
}
