package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

import java.util.List;

/**
 * 2) Создать приложение интернет - магазина(консольное). Приложение должен выполнять следующие операции:
 *
 *    1) добавление товара(название, производитель, дата производства и т.д.).
 *    2) удаление товара с сопутствующими товарами.
 *    3) создание корзины для каждого юзера.
 *    4) выбор товара по определенным критериям и после выводить сопутствующие товары.
 *
 *    Учесть, что каждого товара определенное количество в магазине.
 *
 *    Примеры товаров: мобильные телефоны, телевизоры и т.д.
 *
 *    Только классы с полями
 */

public class ProductStore {
    private String name;
    private String producer;
    private int productionDate;

    private Category category;
    private Category subCategory;

}

/**
 * Category
 * SubCategory
 *
 * Watch Phone, found by name - Apple 12
 *
 * List<Product> products {
 *
 * !!!Phone - Category - Phone, SubCategory - Phones!!! - Apple 12
 * !!!Phone - Category - Phone, SubCategory - Phones!!! - Nokia 1100
 * Charger - Category - Phone, SubCategory - Chargers
 * Headphones - Category - Phone, SubCategory - Headphones
 *
 * }
 *
 */
