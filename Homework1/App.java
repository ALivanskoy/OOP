import goods.HotDrinkGoods;
import machines.HotDrinksVendingMachine;

// 1 Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// 2 Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат 
// и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
// 3 В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.
public class App {
    public static void main(String[] args) {

        HotDrinkGoods hdgCoffeOne = new HotDrinkGoods("Кофе", "Jacobs", 55, 60);
        HotDrinkGoods hdgCoffeTwo = new HotDrinkGoods("Кофе", "NESCAFE", 65, 80);
        HotDrinkGoods hdgTeaOne = new HotDrinkGoods("Чай", "Greenfield", 25, 85);
        HotDrinkGoods hdgTeaTwo = new HotDrinkGoods("Чай", "Золотая чаша", 5, 90);

        HotDrinksVendingMachine hdvmOne = new HotDrinksVendingMachine("Кофе у Ерёмы", 4);
        hdvmOne.putProduct(1, hdgCoffeOne);
        hdvmOne.putProduct(2, hdgCoffeTwo);
        hdvmOne.putProduct(3, hdgTeaOne);
        hdvmOne.putProduct(4, hdgTeaTwo);

        hdvmOne.work();

    }
}
