package map;

import java.util.*;
import java.util.function.Predicate;

public class MapDemoTest {
    public static void main(String[] args) {
        Map<Integer, Ticket> ticketMap = new HashMap<>();

        List<Ticket> ticketList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            Ticket ticket1 = new Ticket();
            ticket1.pnrNumber = "12345" + i;
            Ticket ticket2 = new Ticket();
            ticket2.pnrNumber = "54321";

            ticketList.add(ticket1);
            ticketList.add(ticket2);


            ticketMap.put(ticket1.hashCode(), ticket1);
            ticketMap.put(ticket2.hashCode(), ticket2);
        }
        ticketMap.forEach((k, v) -> {
            System.out.println("key from foreach " + k + "key value foreach" + v);
        });
        Ticket ticket24 = new Ticket();
        ticket24.pnrNumber = "123453680";
        System.out.println("get ticket from list");
        long listStartTime = System.currentTimeMillis();

        Iterator<Ticket> iterator = ticketList.iterator();
        for (; iterator.hasNext(); ) {
            Ticket tickett = iterator.next();
            if (tickett.equals(ticket24)) {
                System.out.println("find ticket" + tickett.pnrNumber);
                break;
            }
        }
        long listEndTime = System.currentTimeMillis();
        System.out.println("time taken" + (listEndTime - listStartTime));
        System.out.println("getting ticket from map");
        long mapstartTime = System.currentTimeMillis();
        Ticket mapTicket = ticketMap.get(ticket24.hashCode());
        System.out.println("find the ticket from map" + mapTicket.pnrNumber);
        long mapEndTime = System.currentTimeMillis();
        System.out.println("time taken for map" + (mapEndTime - mapstartTime));


    }
}
