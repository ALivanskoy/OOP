package Presenter;

import Model.ContactList.ContactList;

public class App {

    public static void main(String[] args) {

        Presenter pr = new Presenter(new ContactList());

        pr.pressXtoWin();
    }
}
