package lessons.ls_01_23.ls_28_01_23.conditional_operator.deposit;

/**
 * Написать логическое выражение для расчета суммы выплаты по
 * депозиту на вклад : до 5000 грн начисляется 20% годовых, от 5000 грн
 * до 10000 грн -22% годовых.
 */
public class Deposit1 {
    public static void main(String[] args) {
        double deposit = 7000;

        if (deposit < 5000) {
            System.out.println("20%");
        } else if(deposit > 5000 && deposit < 10000) {
            System.out.println("22%");
        }
    }
}

/**
 * 2000 < deposit < 5000
 */
