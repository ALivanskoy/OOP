package machines;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import goods.Goods;

public class VendingMachine {

    protected String name; // наименование машины
    protected int volume; // объём товара
    protected TreeMap<Integer, Goods> tray; // Ключ - лоток, значение - товар;
    protected int wallet; // кошелёк автомата
    protected int customerWallet; // счёт покупателя

    public VendingMachine(String name, int volume) {
        this.name = name;
        this.volume = volume;
        this.tray = new TreeMap<>();
        this.wallet = 0;
        this.customerWallet = 0;
    }

    Scanner scn = new Scanner(System.in);

    protected void getMoney() {
        System.out.println("Внесите деньги:");

        try {
            this.customerWallet = scn.nextInt();

            if (this.customerWallet < 0) {
                System.out.println("За эту сумму тут ничего не купишь");
                this.customerWallet = 0;
            } else if (this.customerWallet > 100) {
                System.out.printf("Вам возвращено в качестве сдачи: %d\n", (this.customerWallet - 100));
                this.customerWallet = 100;
            }
        } catch (Exception e) {
            System.out.println("Ошибка, деньги вернутся на вашу карту в течении двух суток"); // вру, не вернутся :)
        }

    }

    protected int choiseProduct() {

        System.out.println("Введите номер интересующего Вас продукта: ");
        try {
            int choise = scn.nextInt();
            return choise;
        } catch (Exception e) {
            return 1;
        }

    }

    protected boolean payment(int number) {

        if (this.customerWallet >= this.tray.get(number).getPrice()) {
            this.wallet += this.tray.get(number).getPrice();
            this.customerWallet = this.customerWallet - this.tray.get(number).getPrice();
            return true;
        } else {
            return false;
        }

    }

    protected void getProduct(int number) {
        System.out.println(
                "Заберите " + this.tray.get(number).getName() + " " + this.tray.get(number).getBrand() + " из лотка");
    }

    public void putProduct(int trayNumber, Goods stuff) {
        if (trayNumber <= this.volume)
            this.tray.put(trayNumber, stuff);
        else
            System.out.println("Позиция " + stuff.getName() + " не загружена. При загрузки выбран лоток №" + trayNumber
                    + ", но объём автомата " + this.volume + " лотков.");
    }

    protected void showProductList() {

        System.out.println("Список доступных товаров:");
        for (Map.Entry<Integer, Goods> entry : this.tray.entrySet()) {
            System.out.println("№ " + entry.getKey() + " " + entry.getValue().toString());
        }
    }

    protected void giveChange() {
        System.out.printf("Вам возвращено в качестве сдачи: %d\n", this.customerWallet);
        this.customerWallet = 0;

    }

    public void work() {

       
        System.out.println("Автомат " + name + " объёмом в " + volume + " лотков в работе");

        while (true) {

            showProductList();
            getMoney();
            int choise = choiseProduct();

            if (payment(choise)) {
                getProduct(choise);
            } else
                System.out.println("Недостаточно средств");

            giveChange();

            System.out.println();

        }
    }

}
