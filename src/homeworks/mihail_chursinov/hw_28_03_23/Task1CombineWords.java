package homeworks.mihail_chursinov.hw_28_03_23;

public class Task1CombineWords {
    /**
     * Create a class named CombineWords. Then add them together and print.
     * But if the last letter if the first word and the first letter of the last letter is the same,
     * print that character once.
     * <p>
     * Input:
     * one
     * eight
     * Output:
     * oneight
     */
    public static void main(String[] args) {
        String word = "one";
        String wordSecond = "eight";

        String substring = wordSecond.substring(1);

        String result = word.concat(substring);
        System.out.println(result);

    }
}
