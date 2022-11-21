package day9;

import java.util.Scanner;

public class AddressBook_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Address Book System!...");
		Addressbook addressBook = new Addressbook();
	
		int option;
		boolean condition = true;

		while (condition) {
			System.out.println("1.ADD CONTACT \n2.DISPLAY CONTACT \n3.EDIT CONTACT ");
			System.out.println("Enter the Option Number");
			option = sc.nextInt();

			switch (option) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.display();
				break;
			case 3:
				addressBook.editContacts();
				break;

			}
	}
	}
}

