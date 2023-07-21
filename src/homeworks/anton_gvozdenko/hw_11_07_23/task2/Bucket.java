package hw_11_07_23.task2;


import java.util.ArrayList;
import java.util.List;

public class Bucket {

    private List<Product> products;

    private int countProducts;
    private int finalPrice;

    public Bucket(int countProducts, int finalPrice) {
        products = new ArrayList<>();
        this.countProducts = countProducts;
        this.finalPrice = finalPrice;
    }

    public void addProduct(Product product) {

        if (products.add(product)) {
            countProducts++;
            finalPrice += product.getPrice();
        }
        System.out.println("Count of products = " + countProducts + "\tFinal price = " + finalPrice);
    }

    public void deleteProduct(Product product) {
        if (products.remove(product)) {
            countProducts--;
            finalPrice -= product.getPrice();
        }
        System.out.println("Count of products = " + countProducts + "\tFinal price = " + finalPrice);
    }
}

