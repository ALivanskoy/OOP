package machines;

import java.util.TreeMap;

import goods.Goods;
import goods.HotDrinkGoods;

public class HotDrinksVendingMachine extends VendingMachine {

    public HotDrinksVendingMachine(String name, int volume) {
        super(name, volume);
        super.wallet = 0;
        super.customerWallet = 0;
        super.tray = new TreeMap<>();

    }

    @Override
    protected void getProduct(int number) {
        HotDrinkGoods drink = (HotDrinkGoods) super.tray.get(number);
        System.out.println(
                "Заберите " + drink.getName() + " " + drink.getBrand()
                        + " разогретый до температуры " + drink.getTemperature());
    }
}
