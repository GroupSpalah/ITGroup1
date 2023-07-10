package lessons.ls_04_23.ls_25_04_23;

/**
 * *** Сohesion and coupling:
 * 		### Когезия означает что класс или модуль может делать.
 * 		Низкая когезия означает что класс делает много операций,
 * 		класс несфукосирован на том, что он должен делать.
 * 		Высокая когезия означает что класс сфокусирован на том, что он должен делать,
 * 		то есть только методы относящиеся к намерениям класса.
 *
 * 		### Связанность - термин относящийся как зависят или относятся два класса или модуля.
 * 		Для низко связанных классов, изменения кода в одном классе не должно влиять на другой класс.
 * 		Высокое связывание приводит к тому, что сложно менять и поддерживать код, поскольку классы тесно связаны,
 * 		внесение изменений может потребовать полной модернизации системы
 *
 * 	Good software design has high cohesion and low coupling.
 */
public class LowCouplingCode {
    public static void main(String[] args) {

        Printable one = new One();
        Printable two = new Two();

        Action action = new Action(two);
    }
}

class Action {
    private Printable printable;

    public Action(Printable printable) {
        this.printable = printable;
    }

    public void run() {
        printable.print();
    }
}

class OldAction {
    private One one;
    private Two two;

    public OldAction(One one, Two two) {
        this.one = one;
        this.two = two;
    }

    public void runOne() {
        one.print();
    }
    public void runTwo() {
        two.print();
    }
}

interface Printable {
    void print();
}

class One implements Printable {
    public void print() {
        System.out.println("One");
    }
}

class Two implements Printable {
    public void print() {
        System.out.println("Two");
    }
}

