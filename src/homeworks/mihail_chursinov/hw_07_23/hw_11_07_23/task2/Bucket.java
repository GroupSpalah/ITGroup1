package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

import java.util.ArrayList;
import java.util.List;

class Bucket {
    private List<Product> products;
    private int countProducts;
    private float price;
    private User user;

    public Bucket(User user) {
        this.products = new ArrayList<>();
        this.countProducts = 0;
        this.price = 0;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public int getCountProducts() {
        return countProducts;
    }

    public float getPrice() {
        return price;
    }

    public void addProduct(Product product) {
        products.add(product);
        countProducts++;
        price += product.getPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        countProducts--;
        price -= product.getPrice();
    }

    public float calculateSum() {

        float sum = 0;

        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

}
