package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AddressBook {
	public static void main(String[] args) {
	ArrayList<AddressBookMain> list = new ArrayList();
	System.out.println("Welcome to Address Book");
	AddressBookMain ab = new AddressBookMain();

	Scanner sc = new Scanner(System.in);

	boolean run = true;

	while (run) {
		System.out.println("Choose any option ");
		System.out.println("1. Add Contact");
		System.out.println("2. Display Contact");
		System.out.println("3. Edit Contact");
		System.out.println("4. Delete Contact");

		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			ab.addContacts();
			break;
		case 2:
			ab.display();
			System.out.println(list);
			break;
		case 3:
			ab.editContact();
			break;
		case 4:
			ab.deleteDetails();
			break;
		case 5:
			run = false;
			break;
		default:
			System.out.println("Please enter the correct option");
			break;
		}

	}

}

}
