/*5. Telephone Bill Calculation
You are required to write a Java program to calculate the telephone bill for a given 
customer based on their usage. The program should take the following inputs from 
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)
The program should then calculate the bill for the customerbased on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers. */
 
import java.util.Scanner;

public class program {
	static Scanner sc = new Scanner(System.in);
	
	static void acceptrecord(TeleEBill T) {
		System.out.println("Enter name : ");
		T.setCustomer_name(sc.next());
		System.out.println("Enter phonenumber : ");
		T.setPhone_number(sc.nextLong());
		System.out.println("Enter number of calls made : ");
		T.setNumber_of_calls_made(sc.nextInt());
		System.out.println("Enter Duration of calls : ");
		T.setDuration_of_calls(sc.nextDouble());
	}
	
	static void acceptbillrecord(TeleEBill T) {
		System.out.println("Enter number of calls made : ");
		T.setNumber_of_calls_made(sc.nextInt());
		System.out.println("Enter Duration pf calls : ");
		T.setDuration_of_calls(sc.nextDouble());
	}
	static int menulist() {
		
		System.out.println("Enter choice : ");
		System.out.println("0. exist");
		System.out.println("1. Add Info ");
		System.out.println("2. Add Info ");
		System.out.println("3. Print Bill");
		int choice =sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		TeleEBill T = new TeleEBill();
		int choice=menulist();
		while(choice>0) {
			switch(choice) {
			case 1:
				program.acceptrecord(T);
				break;
			case 2:
				program.acceptbillrecord(T);
			case 3:
				T.teleBill();
				
			}
			choice = menulist();
		}
		
	}
}
