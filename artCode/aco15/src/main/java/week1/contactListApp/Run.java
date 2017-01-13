package week1.contactListApp;

import week1.contactListApp.exceptions.NotFoundException;
import week1.contactListApp.model.Contact;
import week1.contactListApp.model.ContactBuilder;
import week1.contactListApp.model.ContactListApplication;

import java.io.IOException;

import static week1.contactListApp.InputString.reader;

public class Run {
    private static int allChoices = 5;

    public static void main(String[] args) throws IOException, NotFoundException {
        ContactListApplication application = new ContactListApplication();

        int choice = -1;
        while (choice != 0){

            choice = enterChoice();
            if (choice == 1){
                Contact contact = ContactBuilder.createContract();
                application.addContact(contact);
            } else if (choice == 2){
                application.findContact();
            }
        }

    }

    //TODO: don't like it
    public static void displayMainMenu(){
        System.out.println("Choice action:");
        System.out.println("1. Add contact");
        System.out.println("2. Find contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Update Contact Info");
        System.out.println("5. Show all contacts");
    }

    public static int enterChoice() throws IOException {
        String noSuchOptionError = "No such option.\nPlease, enter correct number, Attempt: %d";
        String errorMessage = "Please, enter correct number, Attempt: %d";

        for (int counter = 1,  choice = -1; counter < 10; counter++) {
            try {
                choice = Integer.parseInt(reader.readLine());
                if (choice > 0 && choice <= Run.allChoices){
                    return choice;
                }
                System.out.println(String.format(noSuchOptionError, counter));
            } catch (NumberFormatException e) {
                System.out.println(String.format(errorMessage, counter));
            }
        }

        return -1;
    }
}
