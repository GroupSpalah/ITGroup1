package homeworks.mihail_chursinov.hw_06_23.hw_23_06_23.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Разработать программу для оператора мобильной связи, позволяющую
 * для отдельно введенных значений даты и времени последнего исходящего
 * звонка определить дату и время истечения срока действия данного пакета
 * и какой это будет день недели (1 – понедельник). В условии договора
 * сказано, что пакет действует в течение 1 года после последнего исходящего звонка.
 */

public class MobileOperator {
    public static void main(String[] args) {
        String lastCallDateStr = "2022-05-09";
        LocalDate lastCallDate = LocalDate.parse(lastCallDateStr);

        LocalDateTime plusOneYear = lastCallDate.plusYears(1).atStartOfDay();
        DayOfWeek expirationDayOfWeek = plusOneYear.getDayOfWeek();

//        int value = LocalDateTime.of().plusYears(1).getDayOfWeek().getValue();

        System.out.println("Дата истечения срока действия пакета: " + plusOneYear);
        System.out.println("День недели истечения срока действия пакета: " + expirationDayOfWeek);
    }
}



