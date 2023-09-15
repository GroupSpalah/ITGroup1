package homeworks.anton_gvozdenko.hw_12_09_23;

public class Goose extends Animal {
    private int eggCount;

    public Goose(String id, int weight) {
        super(id, weight, "гудок");
        this.eggCount = 0;
    }

    public void layEgg() {
        eggCount++;
        System.out.println("Гусак зніс яйце. Всього знесено яєць: " + eggCount);
    }
    public int getEggCount() {
        return eggCount;
    }

    }

