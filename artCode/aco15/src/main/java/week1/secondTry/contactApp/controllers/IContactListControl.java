package week1.secondTry.contactApp.controllers;

import week1.secondTry.contactApp.enums.MobileOperator;
import week1.secondTry.contactApp.model.Contact;

public interface IContactListControl {

    boolean addContact(Contact contact);

    Contact removeLast();

    Contact findContact(int fieldIndex, String value);

    boolean removeContact(int fieldIndex, String value);

    boolean removeContact(Contact contact);

    boolean updateContactInfo(int fieldIndex, String value);

    void showAllContacts();

    void showFirstFiveContacts();

    void showLastFiveContacts();

    //will replace: showLifeContacts, showKievStarContacts
    void showContacts(MobileOperator operator);

    void showLifeContacts();

    void showKievStarContacts();
}
