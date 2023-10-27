package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.HashSet;
import java.util.Set;

public class Buyer  {
    private Set<TrainTicket> availableTickets = new HashSet<>();
    private Set<TrainTicket> soldTickets = new HashSet<>();
    public synchronized void sellTicket(String buyerName, String ticketName) {
        TrainTicket ticket = findAvailableTicket(ticketName);
        while (ticket == null) {
            System.out.println("Билет " + ticketName + " не найден. " + buyerName + " ожидает.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket = findAvailableTicket(ticketName);
        }

        ticket.setSold(true);
        availableTickets.remove(ticket);
        soldTickets.add(ticket);
        System.out.println("Билет " + ticketName + " куплен " + buyerName);
    }
    private TrainTicket findAvailableTicket(String ticketName) {
        for (TrainTicket ticket : availableTickets) {
            if (ticket.getName().equals(ticketName)) {
                return ticket;
            }
        }
        return null;
    }
    public synchronized void addTicket(TrainTicket ticket) {
        availableTickets.add(ticket);
        notifyAll();
    }



    }

