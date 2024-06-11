package metro;

public class Test {
    public static void main(String[] args) {
        JourneyDetails journeyDetails=new JourneyDetails();
        journeyDetails.from="hitechcity";
        journeyDetails.to="nagole";
        journeyDetails.type="oneway";


        Ticket ticket=new Ticket();
        ticket.journeyDetails=journeyDetails;
        ticket.noOfPassengers="1";
        ticket.amount="55";
        ticket.date="31-03-2024";

        System.out.println(journeyDetails);
        System.out.println(ticket);
    }
}
