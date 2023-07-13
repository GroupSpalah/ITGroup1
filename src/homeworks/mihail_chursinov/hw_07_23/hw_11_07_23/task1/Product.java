package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task1;
/**
 * You have a list of numbers to fill table of prices in  the shown way.
 * Implement Java method which receive this list and return the object which will be convenient to
 * find price using month and product keys
 */

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private List<MonthPrice> prices;

    public Product(String name) {
        prices = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<MonthPrice> getPrices() {
        return prices;
    }

    public void addPrice(MonthPrice monthPrice) {
        prices.add(monthPrice);
    }
}
