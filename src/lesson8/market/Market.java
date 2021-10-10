package lesson8.market;

import java.util.HashMap;

public class Market {
    private String name;
    private int profit;
    private HashMap<String, Container> containers;

    public Market(String name) {
        this.name = name;
        containers = new HashMap<>();
    }

    public void supply(String type, int amount, int price) {
        Container products = containers.get(type);
        if (products != null) { // продукт уже существует
            products.setAmount(products.getAmount() + amount);
        } else { // новый продукт
            containers.put(type, new Container(type, amount, price));
        }
    }

    public int getProductAmount(String type) {
        Container products = containers.get(type);
        if (products != null) {
            return products.getAmount();
        } else {
            System.out.println("Товар " + type + " не найден");
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
