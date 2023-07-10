package lessons.ls_03_23.ls_25_03_23;

/**
 *
 Implement method hasNoneLetters. Method returns true if none of the letters
 in the blacklist are present in the phrase.
 If at least one letter from blacklist is present in the phrase return false. Comparison
 should be case insensitive. Meaning 'A' == 'a'
 */
public class Task1 {

    public static void main(String[] args) {
        String phrase = "HeLLo";
        String bl = "h";

        boolean result = hasNoneLetters(phrase, bl);

        System.out.println(result);

        int a = 10;

        a = a + 5;
    }

    public static boolean hasNoneLetters(String phrase, String blackList) {

        phrase = phrase.toLowerCase();
        blackList = blackList.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            char symbol = phrase.charAt(i);

            String symbolAsString = String.valueOf(symbol);
//            String symbolAsString = symbol + "";

//            System.out.println("Sum = " + sum);

            if (blackList.contains(symbolAsString)) {
                return false;
            }

        }

        return true;
    }

}
