package homeworks.anton_gvozdenko.hw_03_10_23.Task2;

import homeworks.anton_gvozdenko.hw_03_10_23.Task2.Pizza.PizzaBuilder;

public class Pizza {
    private String cheese;
    private String meat;
    private String seaFood;
    private String vegetable;
    private String mushroom;


    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSeaFood(String seaFood) {
        this.seaFood = seaFood;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }


    public static PizzaBuilder getBuilder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        private PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder addCheese(String cheese) {
            pizza.setCheese(cheese);
            return this;
        }

        public PizzaBuilder addMeat(String meat) {
            pizza.setMeat(meat);
            return this;
        }

        public PizzaBuilder addSeaFood(String seaFood) {
            pizza.setSeaFood(seaFood);
            return this;
        }

        public PizzaBuilder addMushRoom(String mushroom) {
            pizza.setMushroom(mushroom);
            return this;
        }

        public PizzaBuilder addVegetable(String vegetable) {
            pizza.setVegetable(vegetable);
            return this;
        }

        public PizzaBuilder cook() {
            pizza.setVegetable("Potato");
            pizza.setMeat("Bacon");
            pizza.setMushroom("Mushroom");
            return this;

        }

        public Pizza create() {
            return pizza;
        }

    }
}

class Test {
    public static void main(String[] args) {
        PizzaBuilder pizza = Pizza.getBuilder()
                .addSeaFood("Fish")
                .addMeat("Chicken")
                .addVegetable("Pepper");
        PizzaBuilder standart = Pizza.getBuilder()
                .cook();

    }
}