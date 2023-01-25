package Model.AgentType;

import java.util.Random;

public class Company extends Agent {

    private String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company() {
        super();
        randConstructor();
    }

    @Override
    protected void randConstructor() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        switch (random.nextInt(3)) {
            case 0:
                sb.append("OAO");
                break;
            case 1:
                sb.append("OOO");
                break;
            case 2:
                sb.append("ZAO");
                break;
            default:
                break;
        }
        sb.append(" ");
        switch (random.nextInt(5)) {
            case 0:
                sb.append("SuperITCompany");
                break;
            case 1:
                sb.append("NotAScum");
                break;
            case 2:
                sb.append("HornsAndHooves");
                break;
            case 3:
                sb.append("ZVEZDA");
                break;
            case 4:
                sb.append("HopHeyLaLaLey");
                break;
            default:
                break;
        }

        this.companyName = sb.toString();

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {

        return String.format("Company [%s]", companyName);
    }

}