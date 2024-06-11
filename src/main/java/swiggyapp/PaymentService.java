package swiggyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class PaymentService {



        public List<Payment> payments;
        public PaymentService() {
            this.payments = new ArrayList<>();
        }
        public void makePayment(double amount, String paymentMethod) {
            Payment payment = new Payment(amount, paymentMethod);
            payments.add(payment);
            System.out.println("Payment of Rs:" + amount + " made using " + paymentMethod);
        }

   BiConsumer<Double,String> biConsumer=(amount, paymentMethod)-> {
       Payment payment = new Payment(amount, paymentMethod);
       payments.add(payment);
       System.out.println("Payment of Rs:" + amount + " made using " + paymentMethod);

   };
        public List<Payment> getPayments() {
            return payments;
        }
    }

