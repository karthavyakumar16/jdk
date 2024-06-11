package predicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DryTest {
    public void ticketStatuss(List<Ticket> ticketList, Predicate<Ticket> predicate){
        Iterator<Ticket> itr=ticketList.iterator();
        for(;itr.hasNext();){
            Ticket ticket=itr.next();
            if(predicate.test(ticket)){
                System.out.println("ticket status"+ticket.status);
            }
        }
    }
    public static void main(String[] args) {
        Predicate<Ticket> statuslocked = (ticketlocked) ->
                ticketlocked.status.equals("locked");
        Predicate<Ticket> statusfail = (ticketfail) ->
                ticketfail.status.equals("failed");
        Predicate<Ticket> statussuc= (ticketsuc) ->
                ticketsuc.status.equals("sucess");



        Ticket ticket11 = new Ticket();
        ticket11.pnrNumber = 2345;
        ticket11.status = "locked";

        Ticket ticket22 = new Ticket();
        ticket22.pnrNumber = 3456;
        ticket22.status = "sucess";

        Ticket ticket33 = new Ticket();
        ticket33.pnrNumber = 4567;
        ticket33.status = "failed";


        List<Ticket> ticketdry = new ArrayList<>();

        ticketdry.add(ticket11);
        ticketdry.add(ticket22);
        ticketdry.add(ticket33);


        DryTest dryTest=new DryTest();
        dryTest.ticketStatuss(ticketdry,statuslocked);
        dryTest.ticketStatuss(ticketdry,statusfail);
        dryTest.ticketStatuss(ticketdry,statussuc);

    }
}
