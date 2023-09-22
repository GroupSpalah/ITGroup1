package lessons.ls_09_23.ls_19_09_23;

import java.util.Optional;

public class LearnOptional {
    public static void main(String[] args) {
        String str = "World";

//        print(str);


        Optional.
                of(str)
                .orElseThrow(IllegalArgumentException::new);

    }

    public static void print(String str) {
        String hello = Optional
                .of(str)
                .orElse("Hello");

        System.out.println(hello);
    }

    public static void print1(String str) {
        String hello = Optional
                .ofNullable(str)
                .orElse("Hello");

        System.out.println(hello);
    }
}
