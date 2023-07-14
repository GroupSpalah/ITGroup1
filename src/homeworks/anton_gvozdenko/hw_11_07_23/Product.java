package lessons.homeworks.anton_gvozdenko.hw_11_07_23;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private List<PriceByMonth> price;

    public Product(String name) {
        this.name = name;
        price = new ArrayList<>();
    }

    public void addPrice(PriceByMonth priceByMonth) {
        price.add(priceByMonth);
    }

    public String getName() {
        return name;
    }

    public List<PriceByMonth> getPrice() {
        return price;
    }


}
