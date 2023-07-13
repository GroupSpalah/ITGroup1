package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task1;

import java.time.Month;

public class MonthPrice {
    private Month month;
    private int price;

    public MonthPrice(Month month, int price) {
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
