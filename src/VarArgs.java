package lessons;

public class VarArgs {
    public static void main(String... args) {
        int[] array = {4, 8, 9, 6};

        print(array);

        print1(4, 8, 9, 6, 4);
    }

    public static void print(int[] array) {

    }

    public static void print1(int a, int... array) {

    }
}
