package Model.ContactList;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import Model.AgentType.*;
import Model.Contacts.*;

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

    public ContactList findAgent(String arg) {

        ContactList filtredContactList = new ContactList();

        for (Agent agent : filtredContactList) {

            if (agent.toString().contains(arg))
                filtredContactList.add(agent);

        }

        return filtredContactList;

    }

    @Override
    public Iterator<Agent> iterator() {

        return agentList.iterator();
    }

}
