package lesson8.market;

public class Container {
    private String type;
    private int amount;
    private int price;

    public Container(String type, int amount, int price) {
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
