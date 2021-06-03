package com.addressbook;
import java.util.*;

public class AddressbookMain {
    public List<Addressbook> contactList;

    /**
     * Added welcome message
     * Taking console input.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:\n");
        String firstname = scan.next();
        System.out.println("Enter your last name:\n");
        String lastname = scan.next();
        System.out.println("Enter your Address:\n");
        String address = scan.next();
        System.out.println("Enter your City:\n");
        String city = scan.next();
        System.out.println("Enter your State:\n");
        String state = scan.next();
        System.out.println("Enter your Zip:\n");
        String zip = scan.next();
        System.out.println("Enter your Phone Number:\n");
        String phoneNumber = scan.next();
        System.out.println("Enter your Email:\n");
        String email = scan.next();
        Addressbook contactLists = new Addressbook(firstname, lastname, address, city, state, zip, phoneNumber, email);
    }

    /**
     * this method will return the given input as a string.
     *
     * @return next input.
     */
    public String getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    /**
     * this method will return contactList.
     * @param contact
     * @return contactList
     */
    public List<Addressbook> addContacts(Addressbook contact) {
        contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            return contactList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }

    /**
     * this method will edit the contact according to the input in testcases.
     * @param contactList
     * @param name
     * @param editDetails
     * @return
     */
    public Addressbook editContacts(List<Addressbook> contactList, String name, String editDetails) {
        try {
            for (Addressbook contact : contactList) {
                if (contact.firstname.equals(name)) {
                    switch (name) {
                        case "firstName":
                            contact.firstname = editDetails;
                            break;
                        case "lastName":
                            contact.lastname = editDetails;
                            break;
                        case "address":
                            contact.address = editDetails;
                            break;
                        case "city":
                            contact.city = editDetails;
                            break;
                        case "state":
                            contact.state = editDetails;
                            break;
                        case "zip":
                            contact.zip = editDetails;
                            break;
                        case "phoneNumber":
                            contact.phoneNumber = editDetails;
                            break;
                        case "email":
                            contact.email = editDetails;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean AddContact(Addressbook addressbook) {
        System.out.println(addressbook);
        List<Addressbook> contactList = new ArrayList<>();
        try {
            contactList.add(addressbook);
            System.out.println(contactList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}