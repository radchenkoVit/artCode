package week1.secondTry.contactApp.view;

import week1.secondTry.contactApp.enums.MobileOperator;

public interface IContactListView {
    void showAllContacts();

    void showFirstFiveContacts();

    void showLastFiveContacts();

    //will replace: showLifeContacts, showKievStarContacts
    void showContacts(MobileOperator operator);

    void showContactFields();
}
