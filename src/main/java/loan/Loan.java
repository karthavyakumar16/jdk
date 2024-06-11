package loan;

public class Loan {


        public String firstName;
        public String lastName;
        public double amount;
        public String EMI;
        public String tenure;
        public String loanId;
        public double intrest;

        @Override
        public String toString() {
                return "Loan{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", amount=" + amount +
                        ", EMI='" + EMI + '\'' +
                        ", tenure='" + tenure + '\'' +
                        ", loanId='" + loanId + '\'' +
                        ", intrest=" + intrest +
                        '}';
        }
}

