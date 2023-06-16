package lessons.ls_18_03_23;

public class LearnConstant {


    public static void main(String[] args) {
        final int a = 10;

//        a = 15;

        print(8);

        Constants constants1 = new Constants(8);
        Constants constants2 = new Constants(8);
    }

    public static void print(final int value) {
        System.out.println();
//        value = 10;
    }
}

class Constants {
    private final int age;//non-static constant
    private float weight;

    {
        age = 15;
        System.out.println("Non-static block initialization");
    }

    public Constants(int age) {
        System.out.println("Constructor");
//        this.age = age;
    }

    /*public Constants(float weight) {
        this.weight = weight;
    }*/

   /* public Constants(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }*/
}
