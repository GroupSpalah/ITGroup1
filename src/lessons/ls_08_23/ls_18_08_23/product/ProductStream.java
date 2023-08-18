package lessons.ls_08_23.ls_18_08_23.product;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * Товар(название, дата производства, производитель, хрупкость, цена),
 * Производитель товара(название фирмы, страна производства).
 * <p>
 * Выбрать товары:
 * 1) Одного производителя, хрупкие
 * 2) Товары, произведенные между двумя датами
 * 3) Товары, цена которых лежит в определенном промежутке.
 * 4) Выбрать товары, которые начинаются с определенной(ых) букв.
 */
public class ProductStream {
    public static void main(String[] args) {
        Manufacturer hp = new Manufacturer("HP", "UK");
        Manufacturer lg = new Manufacturer("lg", "USA");
        Manufacturer lenovo = new Manufacturer("lenovo", "Sweden");

        Product pr1 = new Product("Pr1", LocalDate.of(2023, Month.JANUARY, 5),
                lenovo, true, 12.45f);

        Product pr2 = new Product("Pr2", LocalDate.of(2023, Month.FEBRUARY, 15), hp,
                false, 32.45f);

        Product pr3 = new Product("Pr3", LocalDate.of(2023, Month.MARCH, 25), lg,
                true, 32.45f);

        List<Product> products = List.of(pr1, pr2, pr3);


    }

// * 1) Одного производителя, хрупкие

    public static void show1(List<Product> products, Manufacturer manufacturer) {
        products
                .stream()
                .filter(pr -> pr.manufacturer().equals(manufacturer) && pr.isCrush())
                .forEach(pr -> System.out.println(pr));

    }
}

record Manufacturer(String name, String country) {
}

record Product(String name, LocalDate date, Manufacturer manufacturer, boolean isCrush, float price){}