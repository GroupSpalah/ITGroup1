package lessons.ls_03_23.ls_28_03_23;

public class Task3 {
    public static void main(String[] args) {
        String name = "john";

        char firstSymbol = name.charAt(0);//'j'

        String symbolAsString = String.valueOf(firstSymbol);//"j"

        String firstSymbolUpper = symbolAsString.toUpperCase();//"J"

        String newName = name.substring(1);

        String result = firstSymbolUpper.concat(newName);

        System.out.println(result);
    }
}
