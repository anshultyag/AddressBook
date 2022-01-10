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
                System.out.println("Press 0 for Exit contact : ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addPerson();
                        break;
                    case 2:
                        displayPerson();
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
            list.add(new Person(fname, lname, address));

        }

        public static void displayPerson() {
            System.out.println("___________________________________");
            System.out.println("List is :  " + list);

        }
   }
