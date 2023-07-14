package homeworks.anton_gvozdenko.hw_11_07_23.Task2;

import homeworks.anton_gvozdenko.hw_11_07_23.Task2.OtherProduct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
    private String name;
    private String manufacture;
    private Date date;

    private List<OtherProduct> otherProducts;

    public Product(String name, String manufacture, Date date) {
        this.name = name;
        this.manufacture = manufacture;
        this.date = date;
        otherProducts = new ArrayList<>();
    }
}
