package homeworks.anton_gvozdenko.hw_4_23.hw_01_04_23;

public class Task1 {

    public static String repeat(String str, int times, char symbol) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));

            for (int j = 0; j < times; j++) {
                builder.append(symbol);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        System.out.println(repeat("World", 5, '*'));
    }
}