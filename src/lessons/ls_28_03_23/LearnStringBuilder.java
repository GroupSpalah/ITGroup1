package lessons.ls_28_03_23;

public class LearnStringBuilder {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < 10; i++) {
//            str = str + i;

            builder.append(i);
        }

//        System.out.println(str);

        System.out.println(builder.toString());
    }
}

/**
 * iter0: i = 0, str = Hello0, "Hello"
 * iter1: i = 1, str = Hello01, "Hello0"
 */