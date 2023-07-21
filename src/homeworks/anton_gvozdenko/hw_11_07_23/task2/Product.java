package hw_11_07_23.task2;



public class Product {
    private String name;
    private String manufacture;
    private String date;
    private Category category;
    private SubCategory subCategory;
    private float price;

    public Product(String name, String manufacture, String date, Category category, SubCategory subCategory, float price) {
        this.name = name;
        this.manufacture = manufacture;
        this.date = date;
        this.category = category;
        this.subCategory = subCategory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public float getPrice() {
        return price;
    }

    public void view() {
        System.out.println("Name: " + name + "\tManufacture: " + manufacture + "\tCategory: " + category + "\tSubcategory: "
                + subCategory + "\tDate: " + date + "\tPrice: " + price);
    }


}