package homeworks.anton_gvozdenko.hw_20_10_23;

import java.util.*;



class TrainTicket {
    private String name;
    private boolean isSold;

    public TrainTicket(String name) {
        this.name = name;
        this.isSold = false;
    }

    public String getName() {
        return name;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}

class TicketCounter {

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

        ticket.setSold(false);
        soldTickets.remove(ticket);
        availableTickets.add(ticket);
        System.out.println("Билет " + ticketName + " сдан " + sellerName);
        notify();
    }

    public synchronized void addTicket(TrainTicket ticket) {
        availableTickets.add(ticket);
        notifyAll();
    }

    private TrainTicket findAvailableTicket(String ticketName) {
        for (TrainTicket ticket : availableTickets) {
            if (ticket.getName().equals(ticketName)) {
                return ticket;
            }
        }
        return null;
    }

    private TrainTicket findSoldTicket(String ticketName) {
        for (TrainTicket ticket : soldTickets) {
            if (ticket.getName().equals(ticketName)) {
                return ticket;
            }
        }
        return null;
    }



    public static void main(String[] args) throws InterruptedException {


                TicketCounter ticketCounter = new TicketCounter();
                ticketCounter.addTicket(new TrainTicket("Kiev-Lviv"));
                ticketCounter.addTicket(new TrainTicket("Kiev-Odessa"));

                Scanner scanner = new Scanner(System.in);

                Thread buyer1 = new Thread(() -> {
                    System.out.print("Buyer1 вибирає дію (купити/сдати): ");
                    String action = scanner.next();
                    if (action.equals("купити")) {
                        System.out.print("Введіть бажану назву білета: ");
                        String ticketName = scanner.next();
                        ticketCounter.sellTicket("Buyer1", ticketName);
                    } else if (action.equals("сдати")) {
                        System.out.print("Введіть назву білета для повернення: ");
                        String ticketName = scanner.next();
                        ticketCounter.returnTicket("Buyer1", ticketName);
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
                            ticketCounter.sellTicket("Buyer2", ticketName);
                        } else if (action.equals("сдати")) {
                            System.out.print("Введіть назву білета для повернення: ");
                            String ticketName = scanner.next();
                            ticketCounter.returnTicket("Buyer2", ticketName);
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
                            ticketCounter.sellTicket("Seller1", ticketName);
                        } else if (action.equals("сдати")) {
                            System.out.print("Введіть назву білета для повернення: ");
                            String ticketName = scanner.next();
                            ticketCounter.returnTicket("Seller1", ticketName);
                        } else {
                            System.out.println("Невірна дія.");
                        }

                });

                buyer1.start();
                buyer1.join();
                buyer2.start();
                buyer2.join();
seller1.start();
    }
        }






