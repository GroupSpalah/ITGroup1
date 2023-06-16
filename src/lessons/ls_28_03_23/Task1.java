package lessons.ls_28_03_23;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(repeat3("Hello", 3));
    }

    public static String repeat(String str, int times) {

        String result = "";

//        char symbol = 0;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            for (int j = 0; j < times; j++) {
                result += symbol;
            }
        }

        return result;

    }

    public static String repeat1(String str, int times) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            for (int j = 0; j < times; j++) {
                builder.append(symbol);
            }
        }

        return builder.toString();

    }

    public static String repeat2(String str, int times) {

        char[] symbols = str.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < symbols.length; i++) {
            char symbol = symbols[i];

            for (int j = 0; j < times; j++) {
                builder.append(symbol);
            }
        }

        return builder.toString();

    }
    public static String repeat3(String str, int times) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char symbol = str.charAt(i);

            String charAsString = String.valueOf(symbol);

            String repeat = charAsString.repeat(times);

            builder.append(repeat);

        }

        return builder.toString();

    }
}
