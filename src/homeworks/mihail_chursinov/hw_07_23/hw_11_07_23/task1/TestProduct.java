package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task1;

import java.time.Month;

public class TestProduct {
    public static void main(String[] args) {
        MonthPrice price1 = new MonthPrice(Month.JANUARY, 1);
        MonthPrice price2 = new MonthPrice(Month.FEBRUARY, 2);
        MonthPrice price3 = new MonthPrice(Month.MARCH, 3);
        MonthPrice price4 = new MonthPrice(Month.APRIL, 4);
        MonthPrice price5 = new MonthPrice(Month.MAY, 5);
        MonthPrice price6 = new MonthPrice(Month.JUNE, 6);
        MonthPrice price7 = new MonthPrice(Month.JULY, 7);
        MonthPrice price8 = new MonthPrice(Month.AUGUST, 8);
        MonthPrice price9 = new MonthPrice(Month.SEPTEMBER, 9);
        MonthPrice price10 = new MonthPrice(Month.OCTOBER, 10);
        MonthPrice price11 = new MonthPrice(Month.NOVEMBER, 11);
        MonthPrice price12 = new MonthPrice(Month.DECEMBER, 12);

        Product product1 = new Product("Product1");

        product1.addPrice(price1);
        product1.addPrice(price2);
        product1.addPrice(price3);
        product1.addPrice(price4);
        product1.addPrice(price5);
        product1.addPrice(price6);
        product1.addPrice(price7);
        product1.addPrice(price8);
        product1.addPrice(price9);
        product1.addPrice(price10);
        product1.addPrice(price11);
        product1.addPrice(price12);

        ProductService service = new ProductService();
        service.addProduct(product1);

        int price = service.getPriceByNameByIterator("Product1", Month.JULY);

        System.out.println(price);

    }
}
