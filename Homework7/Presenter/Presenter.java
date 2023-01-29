package Presenter;

import java.util.Scanner;

import Model.AgentType.Company;
import Model.AgentType.Person;
import Model.ContactList.ContactList;

import View.View;

public class Presenter {

    ContactList contactList;

    public Presenter(ContactList contactList) {
        this.contactList = contactList;
    }

    public void pressXtoWin() {

        boolean flag = true;
        int choise = 0;

        while (flag) {

            Scanner scanner = new Scanner(System.in);
            View.printMainMenu();
            View.printReady();
            try {
                choise = Integer.parseInt(scanner.nextLine());

                switch (choise) {
                    case 1:
                        View.printList(contactList);
                        break;
                    case 2:
                        View.printFullList(contactList);
                        break;
                    case 3: {
                        System.out.println("Введите искомого контрагента");
                        View.printReady();
                        View.printList(contactList.findAgent(scanner.nextLine()));
                        break;
                    }
                    case 4: {
                        View.printReady();
                        System.out.println("1. Добавить компанию");
                        System.out.println("2. Добавить человека");
                        addAgent(Integer.parseInt(scanner.nextLine()));
                        break;
                    }

                    case 5: {
                        System.out.println("Введите ID контрагента для удаления:");
                        contactList.remove(Integer.parseInt(scanner.nextLine()));
                        break;
                    }

                    case 6: {
                        System.out.println("Введите ID контрагента для просмотра:");
                        choise = Integer.parseInt(scanner.nextLine());
                        View.printAgent(contactList.findAgent(choise));

                        break;
                    }
                    case 7: {
                        flag = false;
                        break;
                    }
                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println("Неверный ввод");
            }

        }

    }

    private void addAgent(int index) {
        if (index == 1) {
            this.contactList.add(new Company());
        } else if (index == 2) {
            this.contactList.add(new Person());
        } else
            System.out.println("Неверный ввод");
    }

}
