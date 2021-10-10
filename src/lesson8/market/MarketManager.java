package lesson8.market;

import java.util.HashMap;

public class MarketManager {
    private HashMap<String, Market> markets;

    public MarketManager() {
        markets = new HashMap<>();
    }

    public void addMarket(String marketName) {
        Market newMarket = new Market(marketName);
        markets.put(marketName, newMarket);
    }

    public void supplyProducts(String marketName, String type, int amount, int price) {
        Market market = markets.get(marketName);
        if (market != null) {
            market.supply(type, amount, price);
        } else {
            System.out.println("Магазин " + marketName + " не существует");
        }
    }

    public int getProductAmount(String marketName, String type) {
        Market market = markets.get(marketName);
        if (market != null) {
            return market.getProductAmount(type);
        } else {
            System.out.println("Магазин " + marketName + " не существует");
            return 0;
        }
    }

    public void listMarkets() {
        System.out.println("Количество магазинов: " + markets.keySet().size());
        for (String marketName : markets.keySet()) {
            System.out.println(marketName);
        }
    }
}
