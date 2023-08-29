package homeworks.mihail_chursinov.hw_08_23.hw_18_08_23;
/**
 * * Товар(название, дата производства, производитель, хрупкость, цена),
 *  * Производитель товара(название фирмы, страна производства).
 *  * <p>
 *  * Выбрать товары:
 *  * 1) Одного производителя, хрупкие
 *  * 2) Товары, произведенные между двумя датами
 *  * 3) Товары, цена которых лежит в определенном промежутке.
 *  * 4) Выбрать товары, которые начинаются с определенной(ых) букв.
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class HomeWorkStream {
    public static void main(String[] args) {
        Manufacturer hp = new Manufacturer("HP", "UK");
        Manufacturer lg = new Manufacturer("lg", "USA");
        Manufacturer lenovo = new Manufacturer("lenovo", "China");

        Product pr1 = new Product("Pr1", LocalDate.of(2023, Month.JANUARY, 5),
                lenovo, true, 12.45f);
        Product pr2 = new Product("Pr2", LocalDate.of(2023, Month.FEBRUARY, 15), hp,
                false, 32.45f);
        Product pr3 = new Product("Pr3", LocalDate.of(2023, Month.MARCH, 25), lg,
                true, 22.45f);
        List<Product> products = List.of(pr1, pr2, pr3);

//        show1(products, lenovo);
//        show2(products,LocalDate.of(2023, Month.JANUARY, 9), LocalDate.of(2023, Month.APRIL, 12));
//        show3(products, 18.3f, 28.5f);
        show4(products, "l");

    }

    public static void show1(List<Product> products, Manufacturer manufacturer) {
        products
                .stream()
                .filter(pr -> pr.manufacturer().equals(manufacturer) && pr.isCrush())
                .forEach(pr -> System.out.println(pr));

    }
    public static void show2(List<Product> products, LocalDate startDate, LocalDate endDate) {
        products
                .stream()
                .filter(pr -> pr.date().isAfter(startDate) && pr.date().isBefore(endDate))
                .forEach(pr -> System.out.println(pr));

    }
    public static void show3(List<Product> products, float minPrice, float maxPrice) {
        products
                .stream()
                .filter(pr -> pr.price() >= minPrice && pr.price() <= maxPrice)
                .forEach(pr -> System.out.println(pr));

    }
    public static void show4(List<Product> products, String letter) {
        products
                .stream()
                .filter(pr -> pr.manufacturer().name().startsWith(letter))
                .forEach(pr -> System.out.println(pr));

    }
}

record Manufacturer(String name, String country) {
}

record Product(String name, LocalDate date, Manufacturer manufacturer, boolean isCrush, float price) {

}
