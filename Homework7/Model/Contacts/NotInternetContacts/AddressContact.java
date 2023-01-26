package Model.Contacts.NotInternetContacts;

import java.util.Random;

import Model.Contacts.Contact;

public class AddressContact implements Contact {

    private String city;
    private String street;
    private Integer building;
    private Integer appartment;

    public AddressContact(String city, String street, Integer building, Integer appartment) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
    }

    public AddressContact() {
        randConstructor();
    }

    @Override
    public String toString() {
        return "Address [City = " + city + ", Street = " + street + ", Building = " + building + ", appartment = "
                + appartment + "]";
    }

    protected void randConstructor() {
        Random random = new Random();

        switch (random.nextInt(6)) {
            case 0:
                this.city = "Moscow";
                break;
            case 1:
                this.city = "Saint Petersburg";
                break;
            case 2:
                this.city = "Novosibirsk";
                break;
            case 3:
                this.city = "Rostov";
                break;
            case 4:
                this.city = "Tomsk";
                break;
            case 5:
                this.city = "Krasnodar";
                break;
            default:
                break;
        }

        switch (random.nextInt(6)) {
            case 0:
                this.street = "Lenina";
                break;
            case 1:
                this.street = "Pobedy";
                break;
            case 2:
                this.street = "Pushkina";
                break;
            case 3:
                this.street = "Borova";
                break;
            case 4:
                this.street = "Suvorova";
                break;
            case 5:
                this.street = "Lesnaya";
                break;
            default:
                break;
        }

        this.building = random.nextInt(1, 99);
        this.appartment = random.nextInt(1, 99);
    }

}
