package collections;

import java.util.ArrayList;
import java.util.Scanner;

import practiseProblemsDay8.adressBookMain;

public class AddressBookMain {
	ArrayList<adressBookMain> list = new ArrayList<>();

	private String firstName, lastName, address, city, state, email;
	private int zipCode, phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	

	@Override
	public String toString() {
		return "adressBookMain [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", email=" + email + ", zipCode=" + zipCode + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public void addContacts() {
		adressBookMain ad = new adressBookMain();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Name");
		ad.setFirstName(sc.next());

		System.out.println("Enter the Last Name");
		ad.setLastName(sc.next());

		System.out.println("Enter the Address");
		ad.setAddress(sc.next());

		System.out.println("Enter the City ");
		ad.setCity(sc.next());

		System.out.println("Enter the State");
		ad.setState(sc.next());

		System.out.println("Enter the Email Id");
		ad.setEmail(sc.next());;

		System.out.println("Enter the ZipCode");
		ad.setZipCode(sc.nextInt());

		System.out.println("Enter the Phone Number");
		ad.setPhoneNumber(sc.nextInt());
		
		list.add(ad);

	}

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			adressBookMain s = list.get(i);
			adressBookMain s1 = list.get(i);

//			System.out.print(list);

			System.out.println("First Name" + " " + s.getFirstName());
			System.out.println("Last Name" + " " + s.getLastName());
			System.out.println("Address" + " " + s.getAddress());
			System.out.println("City" + " " + s.getCity());
			System.out.println("State" + " " + s.getState());
			System.out.println("ZipCode" + " " + s.getZipCode());
			System.out.println("Phone Number" + " " + s.getPhoneNumber());
			System.out.println("Email Id" + " " + s.getEmail());
			System.out.println("----------");

		}
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

		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("Enter the First Name");
			firstName = sc.nextLine();
			setFirstName(sc.nextLine());
			System.out.println(getFirstName());

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


}
