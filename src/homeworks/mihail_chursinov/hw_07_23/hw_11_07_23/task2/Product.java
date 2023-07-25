package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

/**
 * 1) Создать приложение интернет - магазина(консольное). Приложение должен выполнять следующие операции:
 *
 *    1) добавление товара(название, производитель, дата производства и т.д.).
 *    2) добавление сопутствующих товаров.
 *    3) удаление товара с сопутствующими товарами.
 *    4) создание корзины для каждого юзера.
 *    5) выбор товара по определенным критериям и после выводить сопутствующие товары.
 *
 *    Учесть, что каждого товара определенное количество в магазине.
 *
 *    Примеры товаров: мобильные телефоны, телевизоры и т.д.
 */

public class Product {
    private String name;
    private String manufacturer;
    private String productionDate;
    private int count;
    private Category category;
    private Category subCategory;
    private double price;

    public Product(String name, String manufacturer, String productionDate, int quantity, Category category,
                   Category subCategory, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.count = quantity;
        this.category = category;
        this.subCategory = subCategory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public double getPrice() {
        return price;
    }

    public void view() {
        System.out.println("Name: " + name + "\tManufacture: " + manufacturer + "\tProduction of the date: " +
                productionDate +"\tCategory: " + category + "\tSubcategory: " + subCategory + "\tPrice: " + price);
    }
}

