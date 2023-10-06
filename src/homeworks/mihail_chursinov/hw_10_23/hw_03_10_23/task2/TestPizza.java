package homeworks.mihail_chursinov.hw_10_23.hw_03_10_23.task2;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza = Pizza.getBuilder()
                .addCheese("mozzarella")
                .addMeat("pork")
                .addMushroom("сep")
                .build();

        Pizza pizza1 = Pizza.getBuilder()
                .addSeafood("shrimp")
                .addCheese("mozzarella")
                .addVegetable("onion")
                .build();

        Pizza pizza2 = Pizza.getBuilder()
                .cook()
                .build();

        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
