package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task2;

public class Test {
    public static void main(String[] args) {

        DiscountService discountService =
                new DiscountStrategy().getDiscountServiceBySpecialEvent("New Year");
        double discount = discountService.getDiscount();
        DiscountService discountService1 = new DiscountStrategy().getDiscountServiceBySpecialEvent("Birthday");
        double discount1 = discountService1.getDiscount();
        DiscountService discountService2 = new DiscountStrategy().getDiscountServiceBySpecialEvent("Christmas");
        double discount2 = discountService2.getDiscount();

        System.out.println(discount);
        System.out.println(discount1);
        System.out.println(discount2);
    }
}
