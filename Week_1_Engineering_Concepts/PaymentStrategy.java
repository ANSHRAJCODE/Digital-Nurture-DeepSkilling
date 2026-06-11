package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as PaymentStrategy.java
public interface PaymentStrategy { void pay(double amount); }

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amt) { System.out.println("Paid $" + amt + " using Card"); }
}
class PayPalPayment implements PaymentStrategy {
    public void pay(double amt) { System.out.println("Paid $" + amt + " using PayPal"); }
}

class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy s) { this.strategy = s; }
    public void executePayment(double amt) { strategy.pay(amt); }
}