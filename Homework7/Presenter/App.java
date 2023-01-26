package Presenter;

import Model.AgentType.Agent;
import Model.ContactList.ContactList;
import Model.Contacts.Contact;

public class App {

    public static void main(String[] args) {

        ContactList cl = new ContactList();

        for (Agent agent : cl) {
            System.out.println(agent.getId());
            System.out.println(agent.toString());
            for (Contact contact : agent) {
                System.out.println(contact);
            }
            System.out.println();
        }

    }

}
