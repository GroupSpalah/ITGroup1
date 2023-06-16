package homeworks.mihail_chursinov.hw_25_03_23;

public class StringHomeWork {
    /**
     * 1. Дано предложение. Вывести текст, составленный из последних букв всех слов., split, charAt
     * 2. Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину,
     * не используя оператор цикла., substring
     * 3. Count chars of strings placed in the even positions in the given array.
     * For example: array = {"Hello", "world", "from", "array"}
     * the result will be 9: "Hello" length is 5 and "from" length is 4 "world" and "array"
     * are skipped because they are on the odd positions
     * 4. В заданной строке удалить первый символ., substring
     * 5. В заданной строке посчитать количество точек и запятых., charAt
     * 6. В заданной строке найти месторасположение первого символа «*»., indexOf
     */
    public static void main(String[] args) {

        bringOutText();
        countSymbol();
        countChar();

        String word = "friend";
        String word2 = "122*333";

        String substring = word.substring(0, 3);
        String substring2 = word.substring(1);
        int index = word2.indexOf('*');

        System.out.println(substring);
        System.out.println(substring2);
        System.out.println(index);

    }

    public static void bringOutText() {
        String sentence = "Hello my young friend";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word.charAt(word.length() - 1));
        }

    }

    public static void countSymbol() {
        String word = "0/...,,,,,";
        int point = 0;
        int coma = 0;

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (symbol == '.') {
                point++;

            } else if (symbol == ',') {
                coma++;

            }
            System.out.println("Number of points: " + point + "\tNumber of coma: " + coma);

        }

    }

    public static void countChar() {
        int result = 0;
        String[] array = new String[]{"Hello", "world", "from", "array"};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result = array[i].length();
                System.out.println(result);

            }

        }
    }

}
