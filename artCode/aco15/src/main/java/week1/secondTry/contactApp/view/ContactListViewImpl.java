package week1.secondTry.contactApp.view;

import week1.secondTry.contactApp.enums.ContactField;
import week1.secondTry.contactApp.enums.MobileOperator;
import week1.secondTry.contactApp.model.Contact;

import java.util.List;

public class ContactListViewImpl implements IContactListView {
    private List<Contact> contactList;

    public ContactListViewImpl(List<Contact> contactList){
        this.contactList = contactList;
    }

    public void showAllContacts() {
        for (Contact contact: contactList){
            printContact(contact);
        }
    }

    public void showFirstFiveContacts() {
        for (int i = 0; i < 5 && i < contactList.size(); i++){
            printContact(contactList.get(i));
        }
    }

    public void showLastFiveContacts() {
        int startIndex = contactList.size() > 4 ? 5 : contactList.size() - 1;

        for (int i = startIndex; i >= 0; i--){
            printContact(contactList.get(0));
        }
    }

    public void showContacts(MobileOperator operator) {
        for (Contact contact: contactList){
            if (contact.getMobileOperator() == operator){
                printContact(contact);
            }
        }
    }

    public void showContactFields() {
        for (ContactField contactField : ContactField.values()){
            System.out.println(String.format("%d. %s", contactField.getIndex(), contactField.getName()));
        }
    }

    private static void printContact(Contact contact){
        System.out.println(contact);
    }
}
