package com.company;
import java.util.Scanner;
class AddressBook {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        MultipleAddressBooks multiAddressBook = new MultipleAddressBooks();
        boolean isAdd = true;
        while (isAdd) {
            System.out.println("Enter \n 1. Add new AddressBook\n 2. Add contact in AddressBook\n " +
                    "3. Edit the contact in AddressBook\n 4. Delete the contact in AddressBook\n "+
                    "5. Delete the AddressBook\n 6. Print the AddressBook\n 7. Print the contacts in AddressBook\n"+
                    "0.exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    multiAddressBook.addAddressBook();
                    break;
                case 2:
                    multiAddressBook.addContact();
                    break;
                case 3:
                    multiAddressBook.editContactInBook();
                    break;
                case 4:
                    multiAddressBook.deleteContactInBook();
                    break;
                case 5:
                    multiAddressBook.deleteAddressBook();
                    break;
                case 6:
                    multiAddressBook.printBook();
                    break;
                case 7:
                    multiAddressBook.printContactsInBook();
                    break;
                case 0:
                    isAdd = false;
                    System.out.println("Exit Application");
                    break;
                default:
                    isAdd = false;
            }
        }
    }
}