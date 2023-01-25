package Model.AgentType;

import java.util.Random;

public class Person extends Agent {

    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person() {
        super();
        randConstructor();
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();

        switch (random.nextInt(5)) {
            case 0:
                this.firstName = "Alexey";
                break;
            case 1:
                this.firstName = "Nikolay";
                break;
            case 2:
                this.firstName = "Ivan";
                break;
            case 3:
                this.firstName = "Petr";
                break;
            case 4:
                this.firstName = "Boris";
                break;
            default:
                break;
        }

        switch (random.nextInt(5)) {
            case 0:
                this.secondName = "Alexeev";
                break;
            case 1:
                this.secondName = "Nikolaev";
                break;
            case 2:
                this.secondName = "Ivanov";
                break;
            case 3:
                this.secondName = "Petrov";
                break;
            case 4:
                this.secondName = "Borisov";
                break;
            default:
                break;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person [" + firstName + " " + secondName + "]";
    }
}
