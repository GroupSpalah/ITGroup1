package homeworks.mihail_chursinov.hw_01_04_23;

public class Task3 {
    /**
     * If the work starts with x, replace it with a. startsWith
     * Input:
     * xcodex
     * Output:
     * acodex
     */
    public static void main(String[] args) {
        replaceChar();
    }

    public static boolean replaceChar() {
        String str = "xcodex";
        if (str.startsWith("x")) {
            String result = str.replace("x","a");
            System.out.println(result);
        }
        return false;
    }
}
