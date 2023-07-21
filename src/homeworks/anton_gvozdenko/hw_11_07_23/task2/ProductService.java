package hw_11_07_23.task2;





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

    public void chooseProduct(String name, Category category, SubCategory subCategory) {
        for (Product product : products) {
            if (Objects.nonNull(product)
                    && product.getSubCategory().equals(subCategory)) {
                product.view();
            }

        }
    }
}




