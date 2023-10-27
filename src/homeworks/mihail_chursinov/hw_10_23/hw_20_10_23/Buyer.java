package homeworks.mihail_chursinov.hw_10_23.hw_20_10_23;

import java.util.Set;

public class Buyer implements Runnable {
    private String desiredTicket;
    private Set<String> tickets;

    public Buyer(String desiredTicket, Set<String> tickets) {
        this.desiredTicket = desiredTicket;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        synchronized (tickets) {
            try {
                System.out.println("Ticket " + desiredTicket + " not found " + Thread.currentThread().getName()
                        + " wait");
                tickets.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Ticket " + desiredTicket + " purchased " + Thread.currentThread().getName());
        tickets.remove(desiredTicket);
    }
}
