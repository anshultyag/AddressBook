package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBooks {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Contact> contactService = new HashMap<>();

    //add address book
    public void addAddressBook() {
        System.out.println("Enter Name of new Address Book: ");
        String bookName = scanner.next();
        if (contactService.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
            addAddressBook();
        } else {
            Contact contact = new Contact();
            contactService.put(bookName, contact);
            System.out.println("press 1 if you want to add another book or press 0 to exit.");
            int newBook = scanner.nextInt();
            if (newBook == 1) {
                addAddressBook();
            }
        }
    }

    //add contact address book
    public void addContact() {
        System.out.println("Enter the name of Address book to add the contact.");
        String newContact = scanner.next();
        Contact addressBook = contactService.get(newContact);
        if (addressBook != null) {
            contactService.get(newContact).addPerson();
        }
        else {
            System.out.println("No address book with this name");
        }
    }

    //edit contact in address book
    public void editContactInBook() {
        System.out.println("Enter Name to Edit Address Book: ");
        String editBookName = scanner.next();
        if (contactService.containsKey(editBookName)) {
            contactService.get(editBookName).editPerson();
        } else {
            System.out.println("AddressBook doesn't exist!!");
            editContactInBook();
        }
    }

    //delete address book
    public void deleteAddressBook() {
        System.out.println("Enter Name to Delete Address Book: ");
        String bookName = scanner.next();
        if (contactService.containsKey(bookName)) {
            contactService.remove(bookName);
        } else {
            System.out.println("AddressBook doesn't exist!!");
            deleteAddressBook();
        }
    }

    //delete contact in address book
    public void deleteContactInBook() {
        System.out.println("Enter Name to delete the contacts from Address Book : ");
        String bookName = scanner.next();
        if (contactService.containsKey(bookName)) {
            contactService.get(bookName).deletePerson();
        } else {
            System.out.println("AddressBook doesn't exist!!");
            deleteContactInBook();
        }
    }

    //print name of address books
    public void printBook() {
        System.out.println("Address Book Programs are: ");
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    //print contacts of all address book
    public void printContactsInBook() {
        for (Map.Entry<String, Contact> entry : contactService.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            System.out.println(entry.getValue().contactList);
        }
        System.out.println(" ");
    }
}
