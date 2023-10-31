
package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Buyer buyer = new Buyer(new HashSet<>());
        Seller seller = new Seller(new HashSet<>());
        seller.addTicket(new TrainTicket("Kiev-Lviv"));
        seller.addTicket(new TrainTicket("Kiev-Lviv"));
        buyer.addTicket(new TrainTicket("Kiev-Lviv"));


        Thread buyer1 = new Thread(() -> {
            while (true) {
                System.out.print("Buyer вибирає дію (купити/сдати/вийти): ");
                String action = scanner.next();
                if (action.equals("купити")) {
                    System.out.print("Введіть бажану назву білета: ");
                    String ticketName = scanner.next();
                    buyer.buyTicket("Buyer", ticketName);
                } else if (action.equals("сдати")) {
                    System.out.print("Введіть назву білета для повернення: ");
                    String ticketName = scanner.next();
                    seller.returnTicket("Seller", ticketName);
                } else if (action.equals("вийти")) {
                    break;
                } else {
                    System.out.println("Невірна дія.");
                }
            }
        });
        buyer1.start();
    }
}



