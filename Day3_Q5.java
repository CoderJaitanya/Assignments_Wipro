abstract class PaymentMethod {
    public abstract void processPayment();
}


class CreditCard extends PaymentMethod {
    public void processPayment() {
        System.out.println("Processing Credit Card Payment with a 2% fee.");
    }
}


class PayPal extends PaymentMethod {
    public void processPayment() {
        System.out.println("Processing PayPal Payment without any fee.");
    }
}


class PaymentProcessor {
    public void processTransaction(PaymentMethod p) {
        p.processPayment(); 
    }
}


public class Day3_Q5 {
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCard();
        PaymentMethod pp = new PayPal();
        
        PaymentProcessor x = new PaymentProcessor();

        x.processTransaction(cc);                       // Using CreditCard

        x.processTransaction(pp);                       // Using PayPal
    }
}