package metro;

public class Ticket {

    public JourneyDetails journeyDetails;
    public String noOfPassengers;
    public String amount;
    public String date;

    @Override
    public String toString() {
        return "Ticket{" +
                "journeyDetails=" + journeyDetails +
                ", noOfPassengers='" + noOfPassengers + '\'' +
                ", amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
