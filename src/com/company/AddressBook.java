package com.company;
import java.util.ArrayList;
import java.util.Scanner;
    class AddressBook {
        private static ArrayList<Person> list = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String args[]) {
            AddressBook addressBook= new AddressBook();
            boolean isAdd = true;
            while (isAdd) {
                System.out.println("Press 1 for add contact :\n" + "Press 2 for edit contact :\n" + "Press 3 For Remove Contact :\n" + "Press 4 For Exit :");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        //  Person person = AddressBook.addPerson();
                        //list.add(person);
                        addressBook.list.add(addPerson());
                        break;
                    case 2:
                        editPerson();
                        break;
                    case 3:
                        addressBook.list.remove(deletePerson());
                        break;
                    default:
                        isAdd = false;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                AddressBook.display(list.get(i));
            }
        }

        private static  Person addPerson(){
            System.out.println("Enter First name");
            String fname = scanner.next();

            System.out.println("Enter Last name");
            String lname = scanner.next();

            System.out.println("Enter address");
            String address = scanner.next();
            Person person = new Person(fname, lname, address);
            return person;
        }
        public static void editPerson() {
            System.out.println("Enter First name to edit ");
            String name = scanner.next();
            for (Person person : list) {
                if (name .equalsIgnoreCase(person.getName())) {
                    System.out.println("Enter First name : ");
                    String fname = scanner.next();
                    System.out.println("Enter last Name");
                    String lname = scanner.next();
                    System.out.println("Enter address");
                    String address = scanner.next();
                    person.setName(fname);
                    person.setLname(lname);
                    person.setAddress(address);

                }
            }
        }
        private static Person deletePerson(){
            System.out.println("Enter First name");
            String fname = scanner.next();

            System.out.println("Enter Last name");
            String lname = scanner.next();

            System.out.println("Enter address");
            String address = scanner.next();
            Person person = new Person(fname, lname, address);
            return person;
        }
        private static void display(Person person) {
            System.out.println("Name : " + person.getName());
            System.out.println("Email : " + person.getLname());
            System.out.println("Address : " + person.getAddress());
            System.out.println("-----------------------------------------------------");
        }
    }