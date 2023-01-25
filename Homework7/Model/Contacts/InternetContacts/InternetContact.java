package Model.Contacts.InternetContacts;

import Model.Contacts.Contact;

public abstract class InternetContact implements Contact, Comparable<String> {

    private String someContact;

    public InternetContact(String someContact) {
        this.someContact = someContact;
    }

    public InternetContact() { // конструктор, необходимый для быстрой генерации рандомных объектов класса.
                               // Принципы LSP и DIP не нарушены.
        randConstructor();
    }

    @Override
    public boolean equals(Object obj) {

        try {
            return someContact.equals((String) obj);
        } catch (Exception e) {
            return false;
        }

    }

    protected abstract void randConstructor();

    @Override
    public String toString() {
        return someContact;
    }

    @Override
    public int compareTo(String o) {

        return someContact.compareTo(o);
    }

    public String getContact() {
        return someContact;
    }

    public void setContact(String someContact) {
        this.someContact = someContact;
    }

}
