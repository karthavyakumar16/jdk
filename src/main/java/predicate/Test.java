package predicate;

import restarentlist.Restarent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Ticket> ticket = new ArrayList<>();
        Ticket ticket1 = new Ticket();
        ticket1.pnrNumber = 2345;
        ticket1.status = "locked";

        Ticket ticket2 = new Ticket();
        ticket2.pnrNumber = 3456;
        ticket2.status = "sucess";

        Ticket ticket3 = new Ticket();
        ticket3.pnrNumber = 4567;
        ticket3.status = "failed";

        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);


        for (int i = 0; i < ticket.size(); i++) {
            Ticket tickets = ticket.get(i);
            System.out.println(tickets.pnrNumber);
        }
        Predicate<Ticket> statuslocked = (ticketlocked) ->
                ticketlocked.status.equals("locked");
        Iterator<Ticket> iterator = ticket.iterator();
        for (; iterator.hasNext(); ) {
            Ticket tickett = iterator.next();
            if (tickett.status.equals("locked")) {
                System.out.println("locked"+tickett.pnrNumber);
            }
        }
            Predicate<Ticket> statussucess = (ticketsucess) ->
                    ticketsucess.status.equals("sucess");
            Iterator<Ticket> iterator1 = ticket.iterator();
            for (; iterator1.hasNext(); ) {
                Ticket ticketsu = iterator1.next();
                if (ticketsu.status.equals("sucess")) {
                    System.out.println("sucess"+ticketsu.pnrNumber);
                }
            }
                Predicate<Ticket> statufailed = (ticketfailed) ->
                        ticketfailed.status.equals("failed");
                Iterator<Ticket> iterator2 = ticket.iterator();
                for (; iterator2.hasNext(); ) {
                    Ticket ticketfa = iterator2.next();
                    if (ticketfa.status.equals("failed")) {
                        System.out.println("failed"+ticketfa.pnrNumber);


                    }
                }
            }
        }

