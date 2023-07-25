package homeworks.mihail_chursinov.hw_07_23.hw_11_07_23.task2;

public class Test {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        User user = new User("John");
        Bucket bucket = new Bucket(user);

        Product phone = new Product("Phone", "Apple", "2022-05-11", 10,
                Category.PHONES, null, 20000.0);
        Product charger = new Product("Charger", "Apple", "2022-07-21", 20,
                Category.CHARGERS, null, 1500.0);
        Product headphones = new Product("Headphones", "Sony", "2022-01-01", 15,
                Category.HEAD_PHONES, null, 2500.0);

        productService.addProduct(phone);
        productService.addProduct(charger);
        productService.addProduct(headphones);

        productService.chooseProduct("Phone");

//        bucket.addProduct(phone);
//        bucket.addProduct(charger);
//
//        Category selectedCategory = Category.PHONES;
//        int countByCategory = productService.getProductsByCategory(selectedCategory);
//
//        System.out.println("Bucket for user: " + bucket.getUser().getName());
//        System.out.println("Total products in the bucket: " + bucket.getCountProducts());
//        System.out.println("Total price: " + bucket.getPrice());
//        System.out.println("Total products in category " + selectedCategory + ": " + countByCategory);

    }
}

