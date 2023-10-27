package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.Set;

public class Buyer {
    private Set<TrainTicket> tickets;

    public Buyer(Set<TrainTicket> availableTickets) {
        this.tickets = availableTickets;
    }

    public synchronized void sellTicket(String buyerName, String ticketName) {

        TrainTicket ticket = new TrainTicket(ticketName);

        while (!tickets.contains(ticket)) {
            System.out.println("Билет " + ticketName + " не найден. " + buyerName + " ожидает.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        tickets.remove(ticket);
        System.out.println("Билет " + ticketName + " куплен " + buyerName);
    }

    public synchronized void addTicket(TrainTicket ticket) {
        tickets.add(ticket);
        notifyAll();
    }
}

