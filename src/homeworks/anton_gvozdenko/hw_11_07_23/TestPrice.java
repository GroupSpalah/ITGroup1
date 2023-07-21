package hw_11_07_23;

import java.time.Month;

public class TestPrice {
    public static void main(String[] args) {
        PriceByMonth priceDec = new PriceByMonth(Month.DECEMBER, 10);
        PriceByMonth priceJan = new PriceByMonth(Month.JANUARY, 20);
        PriceByMonth priceFeb = new PriceByMonth(Month.FEBRUARY, 30);
        PriceByMonth priceMar = new PriceByMonth(Month.MARCH, 40);
        PriceByMonth priceApr = new PriceByMonth(Month.APRIL, 50);
        PriceByMonth priceMa = new PriceByMonth(Month.MAY, 60);
        PriceByMonth priceJun = new PriceByMonth(Month.JUNE, 70);
        PriceByMonth priceJul = new PriceByMonth(Month.JULY, 80);
        PriceByMonth priceAug = new PriceByMonth(Month.AUGUST, 90);
        PriceByMonth priceSep = new PriceByMonth(Month.SEPTEMBER, 100);
        PriceByMonth priceOct = new PriceByMonth(Month.OCTOBER, 110);
        PriceByMonth priceNov = new PriceByMonth(Month.NOVEMBER, 120);
        PriceByMonth priceDecember = new PriceByMonth(Month.DECEMBER, 15);
        PriceByMonth priceJanuary = new PriceByMonth(Month.JANUARY, 25);
        PriceByMonth priceFebruary = new PriceByMonth(Month.FEBRUARY, 35);
        PriceByMonth priceMarch = new PriceByMonth(Month.MARCH, 45);
        PriceByMonth priceApril = new PriceByMonth(Month.APRIL, 55);
        PriceByMonth priceMay = new PriceByMonth(Month.MAY, 65);
        PriceByMonth priceJune = new PriceByMonth(Month.JUNE, 75);
        PriceByMonth priceJuly = new PriceByMonth(Month.JULY, 85);
        PriceByMonth priceAugust = new PriceByMonth(Month.AUGUST, 95);
        PriceByMonth priceSept = new PriceByMonth(Month.SEPTEMBER, 105);
        PriceByMonth priceOctober = new PriceByMonth(Month.OCTOBER, 115);
        PriceByMonth priceNovember = new PriceByMonth(Month.NOVEMBER, 125);
        Product tv = new Product("TV");
        Product game = new Product("Game");
        tv.addPrice(priceDec);
        game.addPrice(priceJan);
        game.addPrice(priceFebruary);
        game.addPrice(priceMarch);
        game.addPrice(priceApril);
        game.addPrice(priceMay);
        game.addPrice(priceJune);
        game.addPrice(priceJuly);
        game.addPrice(priceAugust);
        game.addPrice(priceSept);
        game.addPrice(priceOctober);
        game.addPrice(priceNovember);
        game.addPrice(priceDecember);
        game.addPrice(priceJanuary);
        tv.addPrice(priceJan);
        tv.addPrice(priceFeb);
        tv.addPrice(priceMar);
        tv.addPrice(priceApr);
        tv.addPrice(priceMa);
        tv.addPrice(priceJun);
        tv.addPrice(priceJul);
        tv.addPrice(priceAug);
        tv.addPrice(priceSep);
        tv.addPrice(priceOct);
        tv.addPrice(priceNov);
        tv.addPrice(priceDec);

        ProductService service = new ProductService();
        service.addProduct(tv);
        service.addProduct(game);
        service.getPrice("TV", Month.JANUARY);
        service.getPrice("Game", Month.MARCH);


    }
}