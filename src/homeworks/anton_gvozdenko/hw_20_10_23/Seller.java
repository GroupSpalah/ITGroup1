package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.HashSet;
import java.util.Set;

public class Seller {

    private Set<TrainTicket> availableTickets = new HashSet<>();
    private Set<TrainTicket> soldTickets = new HashSet<>();

    public synchronized void returnTicket(String sellerName, String ticketName) {
        TrainTicket ticket = findSoldTicket(ticketName);
        while (ticket == null) {
            System.out.println("Билет " + ticketName + " не найден для возврата. " + sellerName + " ожидает.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket = findSoldTicket(ticketName);
        }


        soldTickets.remove(ticket);
        availableTickets.add(ticket);
        System.out.println("Билет " + ticketName + " сдан " + sellerName);
        notify();
    }

    public synchronized void addTicket(TrainTicket ticket) {
        availableTickets.add(ticket);
        notifyAll();
    }


    private TrainTicket findSoldTicket(String ticketName) {
        for (TrainTicket ticket : soldTickets) {
            if (ticket.getName().equals(ticketName)) {
                return ticket;
            }
        }
        return null;
    }

}
