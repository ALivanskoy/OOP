package goods;

public class Goods {

    protected String name;
    protected String brand;
    protected int price;

    public Goods(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", Бренд: " + brand + ", цена: " + price;
    }

    
}
