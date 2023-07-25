package homeworks.anton_gvozdenko.hw_01_04_23;

public class Task2 {
    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        myStr1 = myStr1.toLowerCase();
        myStr2 = myStr2.toLowerCase();

        for (int i = 0; i < myStr1.length(); i++) {
            char symbol = myStr1.charAt(i);
            String stringSymbol = String.valueOf(symbol);

            if (!myStr2.contains(stringSymbol)) {
                System.out.println(stringSymbol);
            }
        }
    }

}
