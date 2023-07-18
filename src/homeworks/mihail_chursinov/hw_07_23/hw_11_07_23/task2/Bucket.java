package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

import java.util.ArrayList;
import java.util.List;

class Bucket {
    private List<Product> products;
    private int countProducts;
    private int price;
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

    public int getPrice() {
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

}
