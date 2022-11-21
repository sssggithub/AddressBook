package day9;

import java.util.Scanner;


public class Addressbook {

	
	   public static void main(String [] args) {
	    Scanner scanner =new Scanner(System.in);
		   Contacts contact=new Contacts();
	        System.out.println("Enter the First name");
	        String firstName=scanner.nextLine();
	       
	        System.out.println("Enter the Last name");
	        String lastName=scanner.nextLine();
	       
	        System.out.println("Enter the City name");
	        String city=scanner.nextLine();
	       
	        System.out.println("Enter the State");
	        String state=scanner.nextLine();
	       
	        System.out.println("Enter the Pin");
	        String pin=scanner.nextLine();
	       
	        System.out.println("Enter the Mobile Number");
	        String mobileNo=scanner.nextLine();
	       
	        System.out.println("Enter the Email Id");
	        String email=scanner.nextLine();
	       
	       
	        contact.setFirstName(firstName);
	        contact.setLastName(lastName);
	        contact.setCity(city);
	        contact.setState(state);
	        contact.setPin(pin);
	        contact.setMobileNumber(mobileNo);
	        contact.setEmail(email);
	       
	       
	        System.out.print(contact);
	       
	    }
	   

}
