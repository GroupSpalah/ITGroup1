package homeworks.anton_gvozdenko.hw_11_07_23;

import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
    private List<Product> products;
    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getPrice(String name, Month month) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getName().equals(name)) {
                List<PriceByMonth> price = product.getPrice();
                Iterator<PriceByMonth> priceByMonthIterator = price.iterator();
                while (priceByMonthIterator.hasNext()) {
                    PriceByMonth priceByMonth = priceByMonthIterator.next();
                    Month newMonth = priceByMonth.getMonth();
                    if (newMonth == month) {
                        int newPrice = priceByMonth.getPrice();
                        System.out.println(newPrice);
                    }
                }
            }

        }
        return 0;
    }
}