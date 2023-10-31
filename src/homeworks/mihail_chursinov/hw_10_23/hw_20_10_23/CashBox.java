package homeworks.mihail_chursinov.hw_10_23.hw_20_10_23;

import java.util.*;

public class  CashBox {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static volatile Set<String> tickets = new LinkedHashSet<>();

    public static void main(String[] args) {

        while (true) {
            menu();
            String key = SCANNER.next();
            try {
                switch (key) {
                    case "1": {
                        String ticket = getInfoFromUser("Please, type name of ticket that you want to sell");

                        String sellerName = getInfoFromUser("Please, type name of seller");

                        Seller seller = new Seller(ticket, tickets);

                        Thread threadSeller = new Thread(seller, sellerName);

                        threadSeller.start();
                        break;
                    }
                    case "2": {
                        String ticket = getInfoFromUser("Please, type name of ticket that you want to buy");

                        String passerName = getInfoFromUser("Please, type name of buyer");

                        Buyer buyer = new Buyer(ticket, tickets);

                        Thread threadBuyer = new Thread(buyer, passerName);

                        threadBuyer.start();
                        break;
                    }
                    case "3": {
                        return;
                    }
                    default:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Exception" + e);
            }
        }

    }

    private static String getInfoFromUser(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }

    public static void menu() {
        System.out.println(
                "1) If you want to sell ticket.\n" +
                "2) If you want to buy ticket.\n" +
                "3) Exit.");

    }
}



