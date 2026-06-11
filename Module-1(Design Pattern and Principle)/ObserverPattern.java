import java.util.*;

interface Observer {
    void update(double stockPrice);
}

class MobileApp implements Observer {

    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock Price = " + stockPrice);
    }
}

class WebApp implements Observer {

    public void update(double stockPrice) {
        System.out.println("Web App: Stock Price = " + stockPrice);
    }
}

interface Stock {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class StockMarket implements Stock {

    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}

public class ObserverPattern {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(1500.50);

        System.out.println();
        stockMarket.setStockPrice(1700.75);
    }
}