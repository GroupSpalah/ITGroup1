/*
package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Buyer buyer  = new Buyer();
        Seller seller = new Seller();
        seller.addTicket(new TrainTicket("Kiev-Lviv"));
        seller.addTicket(new TrainTicket("Kiev-Odessa"));
        buyer.addTicket(new TrainTicket("Kiev-Lviv"));
        Scanner scanner = new Scanner(System.in);

        Thread buyer1 = new Thread(() -> {
            System.out.print("Buyer1 вибирає дію (купити/сдати): ");
            String action = scanner.next();
            if (action.equals("купити")) {
                System.out.print("Введіть бажану назву білета: ");
                String ticketName = scanner.next();
                buyer.sellTicket("Buyer1", ticketName);
            } else if (action.equals("сдати")) {
                System.out.print("Введіть назву білета для повернення: ");
                String ticketName = scanner.next();
                seller.returnTicket("Buyer1", ticketName);
            } else {
                System.out.println("Невірна дія.");
            }
        });


        Thread buyer2 = new Thread(() -> {
            System.out.print("Buyer2 вибирає дію (купити/сдати): ");
            String action = scanner.next();
            if (action.equals("купити")) {
                System.out.print("Введіть бажану назву білета: ");
                String ticketName = scanner.next();
                buyer.sellTicket("Buyer2", ticketName);
            } else if (action.equals("сдати")) {
                System.out.print("Введіть назву білета для повернення: ");
                String ticketName = scanner.next();
                seller.returnTicket("Buyer2", ticketName);
            } else {
                System.out.println("Невірна дія.");
            }
        });
        buyer2.start();
        buyer2.join();
        Thread seller1 = new Thread(() -> {
            System.out.print("Seller1 вибирає дію (купити/сдати): ");
            String action = scanner.next();
            if (action.equals("купити")) {
                System.out.print("Введіть бажану назву білета: ");
                String ticketName = scanner.next();
                buyer.sellTicket("Seller1", ticketName);
            } else if (action.equals("сдати")) {
                System.out.print("Введіть назву білета для повернення: ");
                String ticketName = scanner.next();
                seller.returnTicket("Seller1", ticketName);
            } else {
                System.out.println("Невірна дія.");
            }

        });

        buyer1.start();
        seller1.start();
        buyer2.start();
    }
}


*/
