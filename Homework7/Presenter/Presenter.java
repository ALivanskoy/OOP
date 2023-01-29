package Presenter;

import java.util.Scanner;

import Model.AgentType.Agent;
import Model.AgentType.Company;
import Model.AgentType.Person;
import Model.ContactList.ContactList;
import Model.Contacts.InternetContacts.EmailContact;
import Model.Contacts.InternetContacts.TelegramContact;
import Model.Contacts.InternetContacts.TelephoneContact;
import Model.Contacts.InternetContacts.VkContact;
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
                        scanner.close();
                        break;
                    case 2:
                        View.printFullList(contactList);
                        scanner.close();
                        break;
                    case 3: {
                        System.out.println("Введите искомого контрагента");
                        View.printReady();
                        View.printList(contactList.findAgent(scanner.nextLine()));
                        scanner.close();
                        break;
                    }
                    case 4: {
                        View.printReady();
                        System.out.println("1. Добавить компанию");
                        System.out.println("2. Добавить человека");
                        addAgent(Integer.parseInt(scanner.nextLine()));
                        scanner.close();
                        break;
                    }

                    case 5: {
                        System.out.println("Введите ID контрагента для удаления:");
                        contactList.remove(Integer.parseInt(scanner.nextLine()));
                        scanner.close();
                        break;
                    }

                    case 6: {
                        System.out.println("Введите ID контрагента для просмотра:");
                        choise = Integer.parseInt(scanner.nextLine());
                        scanner.close();
                        agentMenu(choise);
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

    private void agentMenu(int index) {

        Agent agent = contactList.findAgent(index);
        View.printAgent(agent);
        View.printAgentMenu(agent);
        View.printReady();
        try {
            Scanner scanner = new Scanner(System.in);
            index = Integer.parseInt(scanner.nextLine());
            scanner.close();

            switch (index) {
                case 1:
                    addContact(agent);
                    break;
                case 2:
                    removeContact(agent);
                    break;
                case 3:
                    break;

                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }

    }

    private void addContact(Agent agent) {
        View.printAddContactMenu();
        try {
            Scanner scanner = new Scanner(System.in);
            int index = Integer.parseInt(scanner.nextLine());
            scanner.close();

            switch (index) {
                case 1:
                    agent.addContact(new EmailContact());
                    break;
                case 2:
                    agent.addContact(new TelegramContact());
                    break;
                case 3:
                    agent.addContact(new TelephoneContact());
                    break;
                case 4:
                    agent.addContact(new VkContact());
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод");
        }

    }

    private void removeContact(Agent agent) {

    }

}
