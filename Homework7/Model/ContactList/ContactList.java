package Model.ContactList;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import Model.AgentType.Agent;
import Model.AgentType.Company;
import Model.AgentType.Person;
import Model.Contacts.InternetContacts.EmailContact;
import Model.Contacts.InternetContacts.TelegramContact;
import Model.Contacts.InternetContacts.TelephoneContact;
import Model.Contacts.InternetContacts.VkContact;
import Model.Contacts.NotInternetContacts.AddressContact;

public class ContactList implements Iterable<Agent> {

    TreeSet<Agent> agentList;

    public ContactList(TreeSet<Agent> agentList) {
        this.agentList = agentList;
    }

    public ContactList() { // так же как и в других классах, этот конструктор - условность для рандомного
                           // наполнения экземпляра класса
        this.agentList = new TreeSet<Agent>();
        randConstructor();

    }

    protected void randConstructor() {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(5, 10); i++) {

            if (random.nextBoolean()) {

                Agent agent = new Person();
                if (random.nextBoolean())
                    agent.addContact(new TelephoneContact());
                if (random.nextBoolean())
                    agent.addContact(new VkContact());
                if (random.nextBoolean())
                    agent.addContact(new TelegramContact());
                if (random.nextBoolean())
                    agent.addContact(new EmailContact());
                agentList.add(agent);

            } else {

                Agent agent = new Company();
                agent.addContact(new TelephoneContact());
                agent.addContact(new AddressContact());
                agent.addContact(new EmailContact());
                agentList.add(agent);

            }

        }

    }

    public TreeSet<Agent> getAgentList() {
        return agentList;
    }

    public void add(Agent agent) {

        this.agentList.add(agent);
    }

    public void remove(Agent agent) {

        this.agentList.remove(agent);
    }

    public void remove(Integer id) {

        this.agentList.remove(findAgent(id));
    }

    public ContactList findAgent(String arg) {

        ContactList filtredContactList = new ContactList(new TreeSet());

        for (Agent agent : this.agentList) {

            if (agent.toString().contains(arg))
                filtredContactList.add(agent);

        }

        return filtredContactList;

    }

    public Agent findAgent(Integer id) {

        for (Agent agent : this.agentList) {
            if (agent.getId() == id)
                return agent;
        }
        return findAgent(0);
    }

    @Override
    public Iterator<Agent> iterator() {

        return agentList.iterator();
    }

}
