package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public static Scanner scanner = new Scanner(System.in);
    public static Contact contact = new Contact();

    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        createContact();
        editName();
    }

    public static void createContact() {
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
    }

    public static void editName() {
        System.out.println("Edit the Contact");
        boolean condition = true;
        while (condition) {
            System.out.println("Choose the Number \n1.first Name \n2. last Name \n3. Address \n4. city \n5. State \n6 Zip \n7. Phone Number \n8. Email");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the New First Name");
                    String firstName = scanner.next();
                    contact.setFirstName(firstName);
                    condition = false;
                    break;
                case 2:
                    System.out.println("Enter the New Last Name ");
                    String lastName = scanner.next();
                    contact.setLastName(lastName);
                    condition = false;
                    break;
                case 3:
                    System.out.println("Enter the New Address");
                    String address = scanner.next();
                    contact.setAddress(address);
                    condition = false;
                    break;
                case 4:
                    System.out.println("Enter the New City Name");
                    String city = scanner.next();
                    contact.setCity(city);
                    condition = false;
                    break;
                case 5:
                    System.out.println("Enter the New State name");
                    String state = scanner.next();
                    contact.setState(state);
                    condition = false;
                    break;
                case 6:
                    System.out.println("Enter the New zip Number");
                    int zip = scanner.nextInt();
                    contact.setZip(zip);
                    condition = false;
                    break;
                case 7:
                    System.out.println("Enter the New Phone Number");
                    int phoneNumber = scanner.nextInt();
                    contact.setPhoneNumber(phoneNumber);
                    condition = false;
                    break;
                case 8:
                    System.out.println("Enter the New Email id");
                    String emailId = scanner.next();
                    contact.setEmail(emailId);
                    condition = false;
                    break;
                default:
                    System.err.println("Please Enter the valid Number \n ");
                    condition = true;
            }
        }
        System.out.println("Successful change the contact and Save it");
        System.out.println(contact);
    }
}
