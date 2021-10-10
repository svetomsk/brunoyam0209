package lesson8.market;

public class Main {
    public static void main(String[] args) {
        MarketManager manager = new MarketManager();

        manager.addMarket("Magnit");
        manager.addMarket("Diksi");
        manager.addMarket("Pyat'erochka");

        manager.listMarkets();

        int amount = manager.getProductAmount("Magnit", "Картошка");
        System.out.println(amount);
        manager.supplyProducts("Magnit", "Картошка", 100, 50);
        amount = manager.getProductAmount("Magnit", "Картошка");
        System.out.println(amount);
    }
}
