package homeworks.anton_gvozdenko.hw_11_07_23;

import java.time.Month;

public class PriceByMonth {
    private Month month;
    private int price;

    public PriceByMonth(Month month, int price) {
        this.month = month;
        this.price = price;
    }

    public Month getMonth() {
        return month;
    }

    public int getPrice() {
        return price;
    }
}
