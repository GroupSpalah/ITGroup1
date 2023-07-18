package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

import java.util.ArrayList;
import java.util.List;

class ProductService {
    private List<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
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
}