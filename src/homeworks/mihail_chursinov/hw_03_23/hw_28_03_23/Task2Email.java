package homeworks.mihail_chursinov.hw_03_23.hw_28_03_23;

public class Task2Email {
    /**
     * Create a class called EmailTask2.
     * Assume that email address is constructed by person's first name and followed by an underscore and last name.
     * <p>
     * Write a program that will print out information about user based on email. Print first name, last name, and domain.
     * <p>
     * First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
     * <p>
     * Ex:
     * input:
     * craig_federighi@apple.com
     * <p>
     * Output:
     * First name: Craig
     * Last name: Federighi
     * Domain: apple
     */
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String[] wordFirst = email.split("@");
        String[] wordSecond = wordFirst[0].split("_");
        String[] wordThird = wordFirst[1].split("\\.");


        char firstSymbol = wordSecond[0].charAt(0);
        String symbolAsString = String.valueOf(firstSymbol);
        String firstSymbolUpper = symbolAsString.toUpperCase();
        String newName = wordSecond[0].substring(1);
        String firstName = firstSymbolUpper.concat(newName);

        char firstSymbolLastName = wordSecond[1].charAt(0);
        String symbolAsStringSecond = String.valueOf(firstSymbolLastName);
        String firstSymbolUpperLastName = symbolAsStringSecond.toUpperCase();
        String newLastName = wordSecond[1].substring(1);
        String lastName = firstSymbolUpperLastName.concat(newLastName);


        System.out.println("First name:" + "\t" + firstName);
        System.out.println("Last name:" + "\t" + lastName);
        System.out.println("Domain:" + "\t" + wordThird[0]);

    }
}
