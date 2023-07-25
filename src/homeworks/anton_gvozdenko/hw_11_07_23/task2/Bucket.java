package homeworks.anton_gvozdenko.hw_11_07_23.task2;


import java.util.ArrayList;
import java.util.List;

public class Bucket {

    private List<Product> products;

    public Bucket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public float calculateSum() {

        float sum = 0;

        for (Product product : products) {
            sum += product.getPrice();
        }

        return sum;
    }
}

/**
 * Item     Price   Count
 * Phone      10      3
 */

