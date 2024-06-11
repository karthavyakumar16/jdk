package loan;

public class Test {


    public static void main(String[] args) {
        User user = new User();

        Address useraddress = new Address();

        user.firstName = "kumar";
        user.lastName = "karthavya";
        user.mobileNum = "654985189586";
        user.adharNum = "1562434296445";
        user.age = "25";
        user.address = useraddress;

        useraddress.area = "uppal";
        useraddress.flatNo = "754";
        useraddress.pincode = "529986";
        useraddress.country = "India";
        LoanService loanService = new LoanService();
        Loan loan = loanService.getloan(user);
        System.out.println(loan.firstName);
        System.out.println(loan.lastName);
        System.out.println(loan.loanId);
        System.out.println(loan.amount);
        System.out.println(loan.EMI);
        System.out.println(loan.intrest);
        System.out.println(loan.tenure);
    }
}
