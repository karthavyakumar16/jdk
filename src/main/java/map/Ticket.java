package map;

public class Ticket {
    public String pnrNumber;

    public boolean equals(Object obj){
        if(this==obj){
            return  true;

        }
        if(this.getClass()!=obj.getClass()){
            return false;

        }
        Ticket ticket=(Ticket) obj;
        return this.pnrNumber.equals(ticket.pnrNumber);
    }
    public int hashCode(){
        return this.pnrNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pnrNumber='" + pnrNumber + '\'' +
                '}';
    }
}
