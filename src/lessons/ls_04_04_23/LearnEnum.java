package lessons.ls_04_04_23;

public class LearnEnum {
    public static void main(String[] args) {
        Human1 father = new Human1(30, null, null);
        Human1 mother = new Human1(35, null, null);
        Human1 child = new Human1(35, father, mother);

        Country uk = Country.UK;

        print(Country.UK);

        Country canada = Country.CANADA;
        Country canada1 = Country.CANADA;

//        System.out.println(canada.getShortName());

        String c1 = "Ukraine".toUpperCase();

//        System.out.println(Country.valueOf(c1));

        System.out.println(canada1 == canada);
    }

    public static void print(String country) {//"Canada", "Ukraine", "UK"
        if (country.equals("Canada") || country.equals("Ukraine")) {
            //complex logic
        }
    }

    public static void print(Country country) {//"Canada", "Ukraine", "UK"

    }
}

class Human1 {
    private int age;
    private Human1 mother;
    private Human1 father;

    public Human1(int age, Human1 mother, Human1 father) {
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public Human1(int age) {
        this.age = age;
//        this.mother = new Human1();
//        this.father = new Human1();
    }
}
