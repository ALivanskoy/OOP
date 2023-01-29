package View;

import Model.AgentType.Agent;
import Model.ContactList.ContactList;
import Model.Contacts.Contact;

public class View {

    public static void printReady() {

        System.out.println("Ожидается ввод: ");
    }

    public static void printMainMenu() {

        System.out.println("*******************************************");
        System.out.println("Меню:");
        System.out.println("1. Посмотреть список контрагентов");
        System.out.println("2. Посмотреть подробный список контрагентов");
        System.out.println("3. Найти контрагента по названию");
        System.out.println("4. Добавить контрагента");
        System.out.println("5. Удалить контрагента");
        System.out.println("6. Меню контрагента");
        System.out.println("*******************************************");
    }

    public static void printAgentMenu(Agent agent) {

        System.out.println("############################################");
        System.out.println("Меню контрагента:");
        System.out.println("1. Добавить способ связи");
        System.out.println("2. Удалить способ связи");
        System.out.println("3. Выйти из меню контрагента");
        System.out.println("############################################");
    }

    public static void printAddContactMenu() {

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Добавить способ связи:");
        System.out.println("1. Email");
        System.out.println("2. Telegram");
        System.out.println("3. Telephone");
        System.out.println("4. VK");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public static void printList(ContactList contactList) {

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        if (contactList.getAgentList().isEmpty()) {
            System.out.println("Переданный список пуст");
        } else {
            for (Agent agent : contactList) {
                System.out.println("Agent Id:" + agent.getId() + " /// " + agent.toString());
                System.out.println();
            }

        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
    }

    public static void printFullList(ContactList contactList) {

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        if (contactList.getAgentList().isEmpty()) {
            System.out.println("Переданный список пуст");
        } else {
            for (Agent agent : contactList) {
                System.out.println("Agent Id:" + agent.getId() + " /// " + agent.toString());
                for (Contact contact : agent) {
                    System.out.println(contact);
                }
                System.out.println();
            }

        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
    }

    public static void printAgent(Agent agent) {

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(agent.toString());
        int i = 0;
        for (Contact contact : agent) {
            System.out.println(++i + ". " + contact);
        }
        System.out.println();
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
    }

}
