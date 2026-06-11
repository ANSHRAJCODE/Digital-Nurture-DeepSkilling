package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as Notifier.java
public interface Notifier { void send(String msg); }

class EmailNotifier implements Notifier {
    public void send(String msg) { System.out.println("Email: " + msg); }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapped;
    public NotifierDecorator(Notifier n) { this.wrapped = n; }
    public void send(String msg) { wrapped.send(msg); }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier n) { super(n); }
    public void send(String msg) { super.send(msg); System.out.println("SMS: " + msg); }
}
class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier n) { super(n); }
    public void send(String msg) { super.send(msg); System.out.println("Slack: " + msg); }
}