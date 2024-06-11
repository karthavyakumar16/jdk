package bank;

public class AtmMachine {
   public String location;
   public String id;
   public int balance;

   @Override
   public String toString() {
      return "AtmMachine{" +
              "location='" + location + '\'' +
              ", id='" + id + '\'' +
              ", balance=" + balance +
              '}';
   }
}
