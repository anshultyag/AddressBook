package com.company;
import java.util.Scanner;
<<<<<<< HEAD
    class AddressBook {
        private static ArrayList<Person> list = new ArrayList<Person>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]) {
            boolean isAdd = true;
            while (isAdd) {
                System.out.println("Press 1 for add contact :");
                System.out.println("Press 2 for Display contact :");
<<<<<<< HEAD
                System.out.println("Press 0 for Exit contact : ");
=======
                System.out.println("Press 3 for Edit contact : ");
                System.out.println("Press 4 for Remove Contact: ");
                System.out.println("Press 5 for Exit contact : ");
>>>>>>> d5fc14c7488d6cd952181e1ac470f73fd41be706
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addPerson();
                        break;
                    case 2:
                        displayPerson();
<<<<<<< HEAD
=======
                        break;
                    case 3:
                        editPerson();
                        break;
                    case 4:
                        deletePerson();
>>>>>>> d5fc14c7488d6cd952181e1ac470f73fd41be706
                        break;
                    default:
                        isAdd = false;
                }
            }

       }

        public static void addPerson() {
            System.out.println("Enter First name");
            String fname = scanner.nextLine();

            System.out.println("Enter Last name");
            String lname = scanner.nextLine();

            System.out.println("Enter address");
<<<<<<< HEAD
            String address = scanner.nextLine();
=======
            String address = scanner.next();
>>>>>>> d5fc14c7488d6cd952181e1ac470f73fd41be706
            list.add(new Person(fname, lname, address));

        }

        public static void displayPerson() {
            System.out.println("___________________________________");
            System.out.println("List is :  " + list);
<<<<<<< HEAD

        }
   }
=======
         
        }
        public static void editPerson() {
           System.out.println("Please enter your first name");
           String personName = scanner.next();
           System.out.println("___________________________________");
           for (int i = 0; i < list.size(); i++){
               if (list.get(i).getName().equals(personName)){
                   System.out.println("Please Enter first Name");
                   String fname = scanner.next();
                   System.out.println("Enter last Name");
                   String lname = scanner.next();
                   System.out.println("Enter address");
                   String address = scanner.next();
                   list.get(i).setName(fname);
                   list.get(i).setLname(lname);
                   list.get(i).setAddress(address);
               }
           }
        }
        public static void deletePerson() {
            System.out.println("Please enter first nane to delete");
            String personName = scanner.next();
            System.out.println("___________________________________");
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).getName().equals(personName)){
                    list.remove(i);
                    System.out.println("list after removing " + list);
                }else {
                    System.out.println("Enter valid First Name");
                }
            }
        }
    }
>>>>>>> d5fc14c7488d6cd952181e1ac470f73fd41be706
=======
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
>>>>>>> Uc_05_create_multiple_addressbook
