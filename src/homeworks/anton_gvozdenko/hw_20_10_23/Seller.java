package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Seller {

    private Set<TrainTicket> tickets;

    public Seller(Set<TrainTicket> returnedTicket) {
        this.tickets = returnedTicket;
    }
    public synchronized void returnTicket(String sellerName, String ticketName) {
        TrainTicket ticket = new TrainTicket(ticketName);
        while (!tickets.contains(ticket)) {

            System.out.println("Билет " + ticketName + " не найден для возврата. " + sellerName + " ожидает.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        tickets.remove(ticket);
        System.out.println("Билет " + ticketName + " сдан " + sellerName);
        notify();
    }
    public synchronized void addTicket(TrainTicket ticket) {
        tickets.add(ticket);
        notifyAll();
    }


}

