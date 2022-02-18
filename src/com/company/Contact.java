package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Contact {
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();
    List<Person> contactList = new ArrayList<>();

    public void addPerson() {
        System.out.println("Enter the number of contacts you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the contact details of person ");
            createContact();
        }
    }

    public void createContact() {
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new Person(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactList.add(person);
        System.out.println(contactList);
    }

    public void editPerson() {
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.next();

        //check the person information using first name
        for (int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getName();
            if (name.equalsIgnoreCase(editName)) {
                contactList.remove(person);
                createContact();

            }
        }
    }
    public void deletePerson() {
        System.out.println("Please enter first nane to delete");
        String personName = scanner.next();
        System.out.println("___________________________________");
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getName().equals(personName)){
                contactList.remove(i);
                System.out.println("list after removing " + contactList);
            }else {
                System.out.println("Enter valid First Name");
            }
        }
    }
}
