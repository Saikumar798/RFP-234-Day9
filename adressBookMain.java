package practiseProblemsDay9;

import java.util.Scanner;

public class adressBookMain {
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	String firstName, lastName, address, city, state, email;
	int zipCode, phoneNumber;

	public void addContacts() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Name");
		firstName = sc.nextLine();

		System.out.println("Enter the Last Name");
		lastName = sc.nextLine();

		System.out.println("Enter the Address");
		address = sc.nextLine();

		System.out.println("Enter the City ");
		city = sc.nextLine();

		System.out.println("Enter the State");
		state = sc.nextLine();

		System.out.println("Enter the Email Id");
		email = sc.nextLine();

		System.out.println("Enter the ZipCode");
		zipCode = sc.nextInt();

		System.out.println("Enter the Phone Number");
		phoneNumber = sc.nextInt();

	}

	public void display() {

		System.out.println("First Name" + " " + firstName);
		System.out.println("Last Name" + " " + lastName);
		System.out.println("Address" + " " + address);
		System.out.println("City" + " " + city);
		System.out.println("State" + " " + state);
		System.out.println("ZipCode" + " " + zipCode);
		System.out.println("Phone Number" + " " + phoneNumber);
		System.out.println("Email Id" + " " + email);

	}

	public void editContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Below Options ");
		System.out.println("1. First Name");
		System.out.println("2. Last Name");
		System.out.println("3. Address");
		System.out.println("4. City");
		System.out.println("5. State");
		System.out.println("6. ZipCode");
		System.out.println("7. Phone Number");
		System.out.println("8. Email Id");
		
		if(firstName == firstName);

		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("Enter the First Name");
			firstName = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		case 2:
			System.out.println("Enter the Last Name");
			lastName = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		case 3:
			System.out.println("Enter the Address");
			address = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		case 4:
			System.out.println("Enter the City ");
			city = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		case 5:
			System.out.println("Enter the State");
			state = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		case 6:
			System.out.println("Enter the ZipCode");
			zipCode = sc.nextInt();
			System.out.println("Contact is updated");
			break;
		case 7:
			System.out.println("Enter the Phone Number");
			phoneNumber = sc.nextInt();
			System.out.println("Contact is updated");
			break;
		case 8:
			System.out.println("Enter the Email Id");
			email = sc.nextLine();
			System.out.println("Contact is updated");
			break;
		}

	}

	public void deleteDetails() {

		firstName = null;
		lastName = null;
		address = null;
		city = null;
		state = null;
		zipCode = 0;
		phoneNumber = 0;
		email = null;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		adressBookMain ab = new adressBookMain();
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
