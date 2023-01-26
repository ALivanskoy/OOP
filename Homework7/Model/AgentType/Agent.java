package Model.AgentType;

import java.util.ArrayList;
import java.util.Iterator;

import Model.Contacts.Contact;

public abstract class Agent implements Iterable<Contact>, Comparable<Agent> {

    protected Integer id;
    protected ArrayList<Contact> contacts;
    protected static Integer count = 0; // знаю, что так не камильфо, но это сделано в угоду быстрому заполнению при
                                        // гинерации объектов

    public Agent(Integer id, ArrayList<Contact> contacts) {
        this.id = id;
        this.contacts = contacts;
    }

    public Agent() { // конструктор для быстрого заполнения
        this.id = ++count;
        this.contacts = new ArrayList<>();

    }

    protected abstract void randConstructor();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public void removeContact(int index) {
        this.contacts.remove(index);
    }

    @Override
    public Iterator<Contact> iterator() {
        return this.contacts.iterator();
    }

    @Override
    public int compareTo(Agent o) {
        return this.id.compareTo(o.getId());
    }



}