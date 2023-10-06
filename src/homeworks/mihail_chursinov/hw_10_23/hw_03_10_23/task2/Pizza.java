package homeworks.mihail_chursinov.hw_10_23.hw_03_10_23.task2;

public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSeafood(String seafood) {
        this.seafood = seafood;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", seafood='" + seafood + '\'' +
                ", vegetable='" + vegetable + '\'' +
                ", mushroom='" + mushroom + '\'' +
                '}';
    }

    public static PizzaBuilder getBuilder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder addCheese(String name) {
            pizza.setCheese(name);
            return this;
        }

        public PizzaBuilder addMeat(String name) {
            pizza.setMeat(name);
            return this;
        }

        public PizzaBuilder addSeafood(String name) {
            pizza.setSeafood(name);
            return this;
        }

        public PizzaBuilder addVegetable(String name) {
            pizza.setVegetable(name);
            return this;
        }

        public PizzaBuilder addMushroom(String name) {
            pizza.setMushroom(name);
            return this;
        }

        public Pizza build() {
            return pizza;

        }

        public PizzaBuilder cook() {
            pizza.setCheese("mozzarella");
            pizza.setMeat("beef");
            pizza.setVegetable("tomato");
            return this;
        }
    }
}
