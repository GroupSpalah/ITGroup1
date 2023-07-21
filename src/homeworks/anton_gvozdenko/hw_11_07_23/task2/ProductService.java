package homeworks.anton_gvozdenko.hw_11_07_23.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductService {

    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void chooseProduct(String name) {

        for (Product pr : products) {
            if (pr.getName().equals(name)) {
                for (Product pr1 : products) {
                    if (pr1.getCategory() == pr.getCategory() &&
                            pr1.getSubCategory() != pr.getSubCategory()) {
                        pr1.view();
                    }
                }
                break;
            }
        }

    }
}




