package Model.Contacts.InternetContacts;

import java.util.Random;

public class EmailContact extends InternetContact {

    public EmailContact(String eMail) {
        super(eMail);
    }

    public EmailContact() {
        super();
    }

    @Override
    public String toString() {
        return String.format("E-mail: [%s]", super.getContact());
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        switch (random.nextInt(10)) {
            case 0:
                sb.append("Nagibator");
                break;
            case 1:
                sb.append("aKickedInTheButtCorgi");
                break;
            case 2:
                sb.append("izHuliganskihSoobrazheniy");
                break;
            case 3:
                sb.append("aPlatypusfUcker");
                break;
            case 4:
                sb.append("FiftyThoudandRandomScrewnicorns");
                break;
            case 5:
                sb.append("MajidKhoeni");
                break;
            case 6:
                sb.append("iLovePaperhats");
                break;
            case 7:
                sb.append("iLoveArkhangelsk");
                break;
            case 8:
                sb.append("sochiIsTheCapitelOfGreatBritain");
                break;
            case 9:
                sb.append("youNanaLooksBetterThanYeandSheIsInABleedingWoodenOnesie");
                break;
            default:
                break;
        }
        sb.append("@");

        switch (random.nextInt(5)) {
            case 0:
                sb.append("gmail.com");
                break;
            case 1:
                sb.append("yahoo.com");
                break;
            case 2:
                sb.append("casualMail.ru");
                break;
            case 3:
                sb.append("sellTheGarage.ua");
                break;
            case 4:
                sb.append("oink.de");
                break;
            default:
                break;
        }

        super.setContact(sb.toString());
    }
}
