package Presenter;

import Model.AgentType.Agent;
import Model.AgentType.Person;

public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Agent agent = new Person();
            System.out.println(agent+" "+agent.getId());

        }

    }

}
