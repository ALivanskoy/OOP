package Model.Contacts.InternetContacts;

import java.util.Random;

public class VkContact extends InternetContact {

    public VkContact(String someContact) {
        super(someContact);
    }

    public VkContact() {
        super();
    }

    @Override
    public String toString() {
        return String.format("VK: [%s]\n", super.getContact());
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        switch (random.nextInt(6)) {
            case 0:
                sb.append("Record");
                break;
            case 1:
                sb.append("Vedro");
                break;
            case 2:
                sb.append("Ushat");
                break;
            case 3:
                sb.append("Rulon");
                break;
            case 4:
                sb.append("Konec");
                break;
            case 5:
                sb.append("Paket");
                break;

            default:
                break;
        }

        switch (random.nextInt(6)) {
            case 0:
                sb.append("Nadoev");
                break;
            case 1:
                sb.append("Pomoev");
                break;
            case 2:
                sb.append("Gnoev");
                break;
            case 3:
                sb.append("Oboev");
                break;
            case 4:
                sb.append("Geroev");
                break;
            case 5:
                sb.append("Ustoev");
                break;
            default:
                break;
        }

        super.setContact(sb.toString());
    }

}
