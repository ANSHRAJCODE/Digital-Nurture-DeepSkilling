package Week_1_Engineering_Concepts.DesignPatternsMaster;

// Save as Stock.java
import java.util.*;

public interface Stock {
    void register(Observer o); void notifyObservers();
}
interface Observer { void update(double price); }

class MobileApp implements Observer {
    public void update(double p) { System.out.println("Mobile received price update: $" + p); }
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>(); private double price;
    public void register(Observer o) { observers.add(o); }
    public void setPrice(double p) { this.price = p; notifyObservers(); }
    public void notifyObservers() { for(Observer o : observers) o.update(price); }
}