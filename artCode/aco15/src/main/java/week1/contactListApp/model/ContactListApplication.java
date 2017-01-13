package week1.contactListApp.model;

import week1.contactListApp.enums.FindBy;
import week1.contactListApp.exceptions.NotFoundException;
import week1.contactListApp.utils.Finder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static week1.contactListApp.InputString.*;

public class ContactListApplication {

    private List<Contact> contactList;

    public ContactListApplication(){
        contactList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        if (isUnique(contact.getFirstName())) {
            contactList.add(contact);
        }
    }

    public void removeLast(){
        contactList.remove(contactList.size() - 1);
    }


    //TODO: where find logic should be implemented: display menu, etc
    public Contact findContact() throws IOException, NotFoundException {
        int choice = displayFindByMenu();
        FindBy chosenOption = FindBy.getByIndex(choice);

        System.out.println(String.format("Enter: %s", chosenOption.getName()));
        String findByString = reader.readLine();
        Finder finder = new Finder(contactList);

        return finder.find(chosenOption, findByString);
    }

    public boolean removeContact(Contact contact){
        boolean isContain = contactList.contains(contact);
        if (!isContain){
            System.out.println("No contacts found");
            return false;
        } else {
            return contactList.remove(contact);
        }
    }

    public int displayFindByMenu() throws IOException {
        System.out.println("Find contact By:");
        for (FindBy findBy: FindBy.values()){
            System.out.println(String.format("%d. %s", findBy.getIndex(), findBy.getName()));
        }

        int choice = Integer.parseInt(reader.readLine());
        return choice;
    }

    public boolean isUnique(String name){
        for (Contact contact: contactList){
            if (contact.getFirstName().equalsIgnoreCase(name))
                return false;
        }

        return true;
    }
}
