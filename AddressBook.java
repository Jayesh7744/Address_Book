package com.Day_9;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System");
        AddressBook addressBook = new AddressBook();
        addressBook.addDetails();

    }

    public void addDetails(){
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int ZipCode;
        int mobileNumber;
        String emailId;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name ");
        firstName = sc.nextLine();

        System.out.println("Enter Last Name ");
        lastName = sc.nextLine();

        System.out.println("Enter Address ");
        address = sc.nextLine();

        System.out.println("Enter City Name ");
        city = sc.nextLine();

        System.out.println("Enter State Name ");
        state = sc.nextLine();

        System.out.println("Enter Zipcode ");
        ZipCode = sc.nextInt();

        System.out.println("Enter Mobile no ");
        mobileNumber = sc.nextInt();

        System.out.println("Enter EmailId ");
        emailId = sc.nextLine();
        

    }
}

