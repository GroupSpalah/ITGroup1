package homeworks.mihail_chursinov.hw_04_23.hw_15_04_23;

public class AnimalsSounds {
    /**
     * В классе Звуки животных имеются методы которые возвращают звуки, которые издают животные(Корова, кот, мышь),
     * но методы написаны неправильно и возвращают неправильные
     * значения(метод, который должен возвращать "Му", возвращает "Пи").
     * С помощью библиотеки Mockito заставить методы возвращать корректные значения.
     */


    public String cowSound() {
        String cow = "Meow";
        return cow;
    }

    public String catSound() {
        String cat = "Pi";
        return cat;
    }

    public String mouseSound() {
        String mouse = "Mu";
        return mouse;
    }
}
