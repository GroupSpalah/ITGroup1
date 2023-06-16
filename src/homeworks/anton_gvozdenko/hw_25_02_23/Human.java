package homeworks.anton_gvozdenko.hw_25_02_20;

import com.sun.source.tree.NewArrayTree;

public class Human {
    private float weight;
    private float height;
    private int age;
    private int countChildren;

    public Human(float newWeight, float newHeight, int newAge, int newCountChildren) {
        weight = newWeight;
        height = newHeight;
        age = newAge;
        countChildren = newCountChildren;
    }
}

class Data {
    public static void main(String[] args) {
        Human nick = new Human(80, 160, 25, 1);
        Human josh = new Human(75, 175, 40, 3);
        Human martin = new Human(90, 200, 35, 2);
    }
}