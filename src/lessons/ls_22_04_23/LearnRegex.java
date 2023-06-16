package lessons.ls_22_04_23;

import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hallo";
        String regex = "H.llo";//any symbol*/

        /*String text = "Hillo";
        String regex = "H[ae]llo";//or a or e symbol*/
        /*
        String text = "Hillo";
        String regex = "H[a-t]llo";//from a to t symbols*/

        /*String text = "Hllo";
        String regex = "H[0-9]llo";//from 0 to 9 digits*/

       /* String text = "Hillo";
        String regex = "H\\dllo";//from 0 to 9 digits*/
/*
        String text = "H#llo";
        String regex = "H\\Wllo";// special symbols, #,@*/
/*
        String text = "H_llo";
        String regex = "H[A-Za-z0-9_]llo";*/
/*
        String text = "HAllo";
        String regex = "H[A-Za-z0-9_&&[^KT]]llo";*/

//        Quantors
        /*String text = "HABCllo";
        String regex = "H[A-Z]{3}llo";//only 3 times*/

      /*  String text = "HABCllo";
        String regex = "H[A-Z]{1,3}llo";//from 1 to 3 times  */

        String text = "Hgunllo";
        String regex = "H(run|gun)llo";//operator OR

        System.out.println(Pattern.matches(regex, text));
    }
}
