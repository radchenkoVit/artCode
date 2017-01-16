package week1.secondTry.contactApp;

import week1.secondTry.contactApp.controllers.ContactListControlImpl;
import week1.secondTry.contactApp.model.Contact;
import week1.secondTry.contactApp.view.ContactListViewImpl;
import week1.secondTry.contactApp.view.IContactListView;

import java.util.ArrayList;
import java.util.List;

public class RunApp {

    public static void main(String[] args){
        List<Contact> contactList = getFromDB();
        IContactListView listView = new ContactListViewImpl(contactList);

        ContactListControlImpl contactListControl = new ContactListControlImpl(contactList, listView);

        //TODO: how to correct organize data which user should enter
    }

    private static List<Contact> getFromDB(){
        return new ArrayList<Contact>();
    }
}
