package homeworks.anton_gvozdenko.hw_25_03_23;

public class Task1 {
    public static void main(String[] args) {
        String str1 = new String("I am going to get a new car soon");
        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        for (int i = 0; i < words.length; ++i) {
            System.out.print(words[i].charAt(words[i].length()-1));
        }

    }
}

