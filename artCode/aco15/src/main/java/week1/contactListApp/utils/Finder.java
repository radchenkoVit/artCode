package week1.contactListApp.utils;

import week1.contactListApp.enums.FindBy;
import week1.contactListApp.exceptions.NotFoundException;
import week1.contactListApp.model.Contact;

import java.util.List;

import static week1.contactListApp.enums.FindBy.LastName;

public class Finder {
    private List<Contact> contactList;

    public Finder(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Contact find(FindBy findBy, String key) throws NotFoundException {
        if (findBy == LastName){
            for (Contact contact: contactList){
                if (contact.getLastName().equalsIgnoreCase(key));
                return contact;
            }
        } else if (findBy == FindBy.Name){
            for (Contact contact: contactList){
                if (contact.getFirstName().equalsIgnoreCase(key));
                return contact;
            }
        } else if (findBy == FindBy.PhoneNumber){
            for (Contact contact: contactList){
                if (contact.getPhoneNumber().equalsIgnoreCase(key));
                return contact;
            }
        } else {
            for (Contact contact: contactList){
                if (contact.getNote().equalsIgnoreCase(key));
                return contact;
            }
        }

        throw new NotFoundException("Contact was not found");
    }
}
