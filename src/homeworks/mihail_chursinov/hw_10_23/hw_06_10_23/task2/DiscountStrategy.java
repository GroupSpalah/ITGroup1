package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task2;

public class DiscountStrategy {
public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
    return switch (specialEvent) {
        case "New Year" -> new NewYearDiscountService();
        case "Black Friday" -> new BlackFridayDiscountService();
        case "Birthday" -> new BirthdayDiscountService();
        default -> new DefaultDiscountService();
    };
}
}

