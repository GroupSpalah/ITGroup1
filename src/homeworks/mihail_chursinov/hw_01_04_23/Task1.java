package homeworks.mihail_chursinov.hw_01_04_23;

public class Task1 {
    /**
     * Дана непустая строка S и целое число N (> 0). Вывести строку, содержащую символы строки S,
     * между которыми вставлено по N символов «*» (звездочка).
     */
    public static void main(String[] args) {
        System.out.println(repeat1("hello", "*", 3));
        //output: h***e***l***l***o

    }

    public static String repeat1(String str, String star, int times) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            builder.append(symbol);

            for (int j = 0; j < times; j++) {
                if (symbol == str.charAt(str.length() - 1)) {
                    return builder.toString();
                }
                builder.append(star);
            }
        }
        return builder.toString();
    }


}

