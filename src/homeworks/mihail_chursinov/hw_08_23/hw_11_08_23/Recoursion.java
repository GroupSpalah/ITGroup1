package homeworks.mihail_chursinov.hw_08_23.hw_11_08_23;

/**
 * а) Дано 4 - х значное число, вывести в консоль все четные числа
 * б) Дано 4 - х значное число, вывести в консоль все нечетные числа
 * и) Дано 4 - х значное число, вывести в консоль все 1
 */

public class Recoursion {
    public static void main(String[] args) {

      //showEvenNumbers(1885);
      //showOddNumbers(1885);
      showFirstNumbers(1815);

    }

//        public static int showEvenNumbers(int n) {
//
//        if (n % 2 == 0) {
//            return n % 10;
//        }
//        return showEvenNumbers(n / 10);
//    }
//
//    public static int showOddNumbers(int n) {
//
//        if (n % 2 != 0) {
//            return n % 10;
//        }
//        return showEvenNumbers(n / 10);
//    }
    public static void showEvenNumbers(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        if (digit % 2 == 0) {
            System.out.print(digit);
        }

        showEvenNumbers(n /10);
    }
    public static void showOddNumbers(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        if (digit % 2 != 0) {
            System.out.print(digit);
        }

        showOddNumbers(n / 10);
    }
    public static void showFirstNumbers(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        if (digit < 0) {
            System.out.print(digit);
        }

        showOddNumbers(n / 10);
    }
}
