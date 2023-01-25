package Model.Contacts.InternetContacts;

import java.util.Random;

public class TelegramContact extends InternetContact {

    public TelegramContact(String someContact) {
        super(someContact);
    }

    public TelegramContact() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Telegram: [%s]\n", super.getContact());
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        switch (random.nextInt(6)) {
            case 0:
                sb.append("Dark");
                break;
            case 1:
                sb.append("Light");
                break;
            case 2:
                sb.append("Some");
                break;
            case 3:
                sb.append("Lonely");
                break;
            case 4:
                sb.append("Is");
                break;
            case 5:
                sb.append("Where");
                break;

            default:
                break;
        }

        switch (random.nextInt(6)) {
            case 0:
                sb.append("Night");
                break;
            case 1:
                sb.append("Darkness_XD");
                break;
            case 2:
                sb.append("Habubei");
                break;
            case 3:
                sb.append("SHREK");
                break;
            case 4:
                sb.append("FoReVeR");
                break;
            case 5:
                sb.append("bee$");
                break;
            default:
                break;
        }

        super.setContact(sb.toString());
    }
}
