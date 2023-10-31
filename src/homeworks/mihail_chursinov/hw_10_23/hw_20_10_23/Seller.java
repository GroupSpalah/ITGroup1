package homeworks.mihail_chursinov.hw_10_23.hw_20_10_23;

import java.util.Set;

public class Seller implements Runnable {
    private String ticketToSell;
    private Set<String> tickets;

    public Seller(String ticketToSell, Set<String> tickets) {
        this.ticketToSell = ticketToSell;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        synchronized (tickets) {
           while (!tickets.contains(ticketToSell)) {
                tickets.add(ticketToSell);
                System.out.println("Ticket " + ticketToSell + " was passed " + Thread.currentThread().getName());
               try {
                   tickets.wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
                System.out.println("Ticket " + ticketToSell + " already in stock " + Thread.currentThread().getName());
            }
        }
    }

