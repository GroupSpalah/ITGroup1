package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task1;

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

    public int getPriceByNameByIterator(String name, Month month1) {
        Iterator<Product> productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();

            if (product.getName().equals(name)) {
                List<MonthPrice> prices = product.getPrices();

                Iterator<MonthPrice> monthPriceIterator = prices.iterator();

                while (monthPriceIterator.hasNext()) {
                    MonthPrice monthPrice = monthPriceIterator.next();

                    Month month = monthPrice.getMonth();

                    if (month.equals(month1)) {
                        return monthPrice.getPrice();
                    }
                }
            }
        }
        return 0;
    }

    public int getPriceByNameByFor(String name, Month month1) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                List<MonthPrice> prices = product.getPrices();

                for (MonthPrice monthPrice : prices) {
                    Month month = monthPrice.getMonth();

                    if (month.equals(month1)) {
                        return monthPrice.getPrice();
                    }
                }
            }
        }
        return 0;
    }
}
