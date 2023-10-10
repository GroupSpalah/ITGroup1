package homeworks.anton_gvozdenko.hw_06_10_23.Task2;


interface DiscountService {
    double getDiscount();
}


class DefaultDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 0;
    }
}

class NewYearDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 20;
    }
}

class BirthdayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 33;
    }
}

class BlackFridayDiscountService implements DiscountService {
    @Override
    public double getDiscount() {
        return 45;
    }
}


class DiscountStrategy {
    private DiscountService discountService;

    public void getDiscount(String specialEvent) {
        if (specialEvent.contains("Birthday")) {
            discountService = new BirthdayDiscountService();
        } else if (specialEvent.contains("New Year")) {
            discountService = new NewYearDiscountService();
        } else if (specialEvent.contains("Black Friday")) {
            discountService = new BirthdayDiscountService();
        } else {
            discountService = new DefaultDiscountService();
        }
    }
}


class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy();
        discountStrategy.getDiscount("New Year");
        discountStrategy.getDiscount("Black Friday");
        discountStrategy.getDiscount("Birthday");


    }
}

