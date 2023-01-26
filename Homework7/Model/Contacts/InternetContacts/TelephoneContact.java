package Model.Contacts.InternetContacts;

import java.util.Random;

public class TelephoneContact extends InternetContact {

    public TelephoneContact(String someContact) {
        super(someContact);
    }

    public TelephoneContact() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Telephone: [%s]", super.getContact());
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder("+79");

        for (int i = 0; i < 9; i++) {
            sb.append(random.nextInt(10));
        }

        super.setContact(sb.toString());
    }

}
