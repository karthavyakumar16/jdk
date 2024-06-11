package functionp;

public class ChatgptCode {

        public static void main(String[] args) {
            int num = 5;
            int factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        // Function to calculate factorial
        public static int calculateFactorial(int n) {
            if (n == 0)
                return 1;
            else
                return n * calculateFactorial(n - 1);
        }
    }




