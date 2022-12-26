package goods;

public class HotDrinkGoods extends Goods {

    private int temperature;

    public HotDrinkGoods(String name, String brand, int price, int temperature) {
        super(name, brand, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", Бренд: " + brand + ", температура = " + temperature + ", цена: " + price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
