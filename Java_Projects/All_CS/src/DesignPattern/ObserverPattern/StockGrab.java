package DesignPattern.ObserverPattern;

public class StockGrab implements Observer {
    private String stockName;
    public StockGrab(StockCenter center, String stockName) {
        this.stockName = stockName;
    }

    @Override
    public void update(String[] stockPrice) {
        if (stockName.equals("google")) {
            System.out.println("Google price: "  + stockPrice[0]);
        }
        else if (stockName.equals("apple")) {
            System.out.println("Apple price: "  + stockPrice[1]);
        }
    }
}
