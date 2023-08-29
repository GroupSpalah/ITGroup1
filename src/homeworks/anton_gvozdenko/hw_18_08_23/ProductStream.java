package homeworks.anton_gvozdenko.hw_18_08_23;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class ProductStream {
    public static void main(String[] args) {
        Manufacturer hp = new Manufacturer("HP", "UK");
        Manufacturer lg = new Manufacturer("lg", "USA");
        Manufacturer lenovo = new Manufacturer("lenovo", "Sweden");

        Product pr1 = new Product("Phone", LocalDate.of(2023, Month.JANUARY, 5),
                lenovo, true, 12.45f);

        Product pr2 = new Product("Notebook", LocalDate.of(2023, Month.FEBRUARY, 15), hp,
                false, 32.45f);

        Product pr3 = new Product("Computer", LocalDate.of(2023, Month.MARCH, 25), lg,
                true, 32.45f);

        List<Product> products = List.of(pr1, pr2, pr3);
        show1(products, lg);
        show2(products, LocalDate.of(2023, Month.JANUARY, 5), LocalDate.of(2023, Month.FEBRUARY, 20));
        showByPhrase(products, "No");
        show3(products, 20.00f, 35.00f);

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

    public static void showByPhrase(List<Product> products, String phrase) {
        products
                .stream()
                .filter(pr -> pr.name().startsWith(phrase))
                .forEach(pr -> System.out.println(pr));
    }


    record Manufacturer(String name, String country) {
    }

    record Product(String name, LocalDate date, Manufacturer manufacturer, boolean isCrush, float price) {
    }
}