package homeworks.mihail_chursinov.hw_08_23.hw_11_08_23;

public class dd {
    public static void showOddDigits(int n) {
        if (n == 0) {
            return; // Базовий випадок: число стало 0, завершуємо рекурсію
        }

        int digit = n % 10; // Отримуємо останню цифру числа
        if (digit % 2 == 0) {
            System.out.print(digit); // Виводимо цифру, якщо вона непарна
        }

        showOddDigits(n / 10); // Виклик функції для меншого числа, видаляючи останню цифру
    }

    public static void main(String[] args) {

        showOddDigits(8985);
    }

}
