package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contact> contactArrayList = new ArrayList<>();

    public static void editDeleteContact() {
        boolean condition = true;
        while (condition == true) {
            System.out.println("Choose the Number if you have edit or delete the contact \n1. Edit \n2. Delete \n3. Show the Contacts lists \n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    editName();
                    condition = true;
                    break;
                case 2:
                    delete();
                    condition = true;
                    break;
                case 3:
                    System.out.println(contactArrayList);
                    condition = true;
                    break;
                case 4:
                    System.out.println("Exiting.......");
                    condition = false;
                    break;
                default:
                    System.out.println("Please Enter the Valid Number");
                    condition = true;
                    break;
            }
        }
    }

    public static void multiplyContact(int numberOfContact) {
        for (int i = 1; i <= numberOfContact; i++) {
            createContact();
        }
        System.out.println(contactArrayList);
    }

    public static void createContact() {
        Contact contact = new Contact();
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("Enter the Address");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.println("Enter the City");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter the State");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter the Zip Number");
        int zip = scanner.nextInt();
        contact.setZip(zip);
        System.out.println("Enter the Phone Number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("Enter the Email Id");
        String email = scanner.next();
        contact.setEmail(email);
        System.out.println(contact);
        contactArrayList.add(contact);
    }

    public static void editName() {
        System.out.println("Edit the Contact");
        System.out.println("Enter the first name");
        String name = scanner.next();
        for (int i = 0; i < contactArrayList.size(); i++) {
            if (contactArrayList.get(i).getFirstName().equals(name)) {
                boolean condition = true;
                while (condition) {
                    System.out.println("Choose the Number \n1.first Name \n2. last Name \n3. Address \n4. city \n5. State \n6 Zip \n7. Phone Number \n8. Email");
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.println("Enter the New First Name");
                            String firstName = scanner.next();
                            contactArrayList.get(i).setFirstName(firstName);
                            condition = false;
                            break;
                        case 2:
                            System.out.println("Enter the New Last Name ");
                            String lastName = scanner.next();
                            contactArrayList.get(i).setLastName(lastName);
                            condition = false;
                            break;
                        case 3:
                            System.out.println("Enter the New Address");
                            String address = scanner.next();
                            contactArrayList.get(i).setAddress(address);
                            condition = false;
                            break;
                        case 4:
                            System.out.println("Enter the New City Name");
                            String city = scanner.next();
                            contactArrayList.get(i).setCity(city);
                            condition = false;
                            break;
                        case 5:
                            System.out.println("Enter the New State name");
                            String state = scanner.next();
                            contactArrayList.get(i).setState(state);
                            condition = false;
                            break;
                        case 6:
                            System.out.println("Enter the New zip Number");
                            int zip = scanner.nextInt();
                            contactArrayList.get(i).setZip(zip);
                            condition = false;
                            break;
                        case 7:
                            System.out.println("Enter the New Phone Number");
                            int phoneNumber = scanner.nextInt();
                            contactArrayList.get(i).setPhoneNumber(phoneNumber);
                            condition = false;
                            break;
                        case 8:
                            System.out.println("Enter the New Email id");
                            String emailId = scanner.next();
                            contactArrayList.get(i).setEmail(emailId);
                            condition = false;
                            break;
                        default:
                            System.err.println("Please Enter the valid Number");
                            condition = true;
                            break;
                    }
                }
                System.out.println(contactArrayList.get(i));
                System.out.println("Successful change the contact and Save it");
            }
        }
    }

    public static void delete() {
        System.out.println("Delete the Person Details");
        System.out.println("Enter the name");
        String name = scanner.next();
        for (int i = 0; i < contactArrayList.size(); i++) {
            if (contactArrayList.get(i).getFirstName().equals(name)) {
                contactArrayList.remove(contactArrayList.get(i));
            }
        }
        System.out.println(contactArrayList);
        System.out.println("successfully Delete the contact");
    }
}
