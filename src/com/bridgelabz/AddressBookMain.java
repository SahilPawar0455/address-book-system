package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        System.out.println("How Many Create the Contact in Your Address Book");
        int numberOfContact = scanner.nextInt();
        AddressBook.multiplyContact(numberOfContact);
        AddressBook.editDeleteContact();
    }
}
