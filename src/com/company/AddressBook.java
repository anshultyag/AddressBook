package com.company;
import java.util.ArrayList;
import java.util.Scanner;
    class AddressBook {
        private static ArrayList<Person> list = new ArrayList<Person>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]) {
            boolean isAdd = true;
            while (isAdd) {
                System.out.println("Press 1 for add contact :");
                System.out.println("Press 2 for Display contact :");
                System.out.println("Press 3 for Edit contact : ");
                System.out.println("Press 4 for Remove Contact: ");
                System.out.println("Press 5 for Exit contact : ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addPerson();
                        break;
                    case 2:
                        displayPerson();
                        break;
                    case 3:
                        editPerson();
                        break;
                    case 4:
                        deletePerson();
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
            String address = scanner.nextLine();
            String address = scanner.next();
            list.add(new Person(fname, lname, address));

        }

        public static void displayPerson() {
            System.out.println("___________________________________");
            System.out.println("List is :  " + list);
        }
   }
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
