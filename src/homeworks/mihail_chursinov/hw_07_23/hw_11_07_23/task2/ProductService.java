package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ProductService {
    private List<Product> products;

    public ProductService() {
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getProductsByCategory(Category category) {
        int count = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                count++;
            }
        }
        return count;
    }

    public int getProductsBySubcategory(Category subcategory) {
        int count = 0;
        for (Product product : products) {
            if (product.getSubCategory() == subcategory) {
                count++;
            }
        }
        return count;
    }

    public void chooseProduct(String name) {
        for (Product pr : products) {
            if (pr.getName().equals(name)) {
                for (Product pr1 : products) {
                    if (pr1.getCategory() == pr.getCategory() && pr1.getSubCategory() != pr.getSubCategory()) {
                        pr1.view();
                    }
                }
            }
        }
    }

}