package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as PaymentProcessor.java
public interface PaymentProcessor { void processPayment(double amount); }

class GPayGateway {
    public void executeTxn(double money) { System.out.println("GPay Paid: $" + money); }
}
class PayPalGateway {
    public void sendMoney(double cash) { System.out.println("PayPal Sent: $" + cash); }
}

class GPayAdapter implements PaymentProcessor {
    private GPayGateway gpay = new GPayGateway();
    public void processPayment(double amount) { gpay.executeTxn(amount); }
}
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal = new PayPalGateway();
    public void processPayment(double amount) { paypal.sendMoney(amount); }
}