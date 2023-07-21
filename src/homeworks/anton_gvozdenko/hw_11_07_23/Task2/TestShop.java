package hw_11_07_23.task2;
public class TestShop {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(0, 0);
        Product product = new Product("Phone", "Nokia", "01.01.21", Category.PHONE, SubCategory.PHONES
                , 1100);
        Product productTWo = new Product("Mouse", "Asus", "02.02.2020", Category.COMPUTER,
                SubCategory.MOUSES, 1200);
        ProductService service = new ProductService();
        service.addProduct(product);
        service.addProduct(productTWo);
        service.chooseProduct("Phone", Category.PHONE, SubCategory.PHONES);
        service.chooseProduct("Mouse",Category.COMPUTER,SubCategory.MOUSES);
        bucket.addProduct(product);
        bucket.addProduct(productTWo);
    }
}
