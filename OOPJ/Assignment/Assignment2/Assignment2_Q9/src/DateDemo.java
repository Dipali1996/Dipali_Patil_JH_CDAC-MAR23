/*Date Class
You are required to write a Java program to implement a Date class.
The Date class should have the following fields:
a. day: An integer field to store the day of the month.
b. month: An integer field to store the month of the year.
c. year: An integer field to store the year.
The Date class should have the following methods:
a. isValid(): A method to check if the date is valid or not. A date is considered 
valid if it is a valid date of the Gregorian calendar, and has a day, month, and 
year that are within a reasonable range.
b. getDayOfWeek(): A method to return the day of the week for the given date, 
where Sunday is represented by 0, Monday by 1, and so on.
c. isLeapYear(): A method to check if the year of the given date is a leap year or 
not
d. getNextDay(): A method to return the date of the next day.
e. getPreviousDay(): A method to return the date of the previous day.
Example Usage
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid()); // true
System.out.println(date.getDayOfWeek()); // 6 (Saturday)
System.out.println(date.isLeapYear()); // false
Date nextDay = date.getNextDay();
System.out.println(nextDay); // 01-01-2023
Date previousDay = date.getPreviousDay();
System.out.println(previousDay); // 30-12-2022
*/
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateDemo {
	int day;
	int month;
	int year;
	
	static Scanner sc = new Scanner(System.in);
	
	public DateDemo() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void acceptDate() {
		System.out.println("Enter date : ");
		this.day = sc.nextInt();
		System.out.println("Enter month : ");
		this.month = sc.nextInt();
		System.out.println("Enter year : ");
		this.year = sc.nextInt();
	}
	
	public void isValid(){
		
		try {
			LocalDate ld = LocalDate.of(getYear(),getMonth(),getDay());
			System.out.println("Valid Date");
		}catch(DateTimeException d) {
			 System.out.println("Invalid Date");
		}
		  
	}
	public void getDayOfWeek() {
		LocalDate ld = LocalDate.of(getYear(),getMonth(),getDay());
		System.out.println("Day of week "+ld.getDayOfWeek());
	}
	public void isLeapYear() {
		LocalDate ld = LocalDate.of(getYear(),getMonth(),getDay());
		System.out.println("Leap Year : "+ld.isLeapYear());
	}
	public void getNextDay() {
		LocalDate ld = LocalDate.of(getYear(),getMonth(),getDay());;
		 System.out.println("next Day "+ld.plusDays(1));
	}
	public void getPreviousDay() {
		LocalDate ld = LocalDate.of(getYear(),getMonth(),getDay());
		System.out.println("Previous Day : "+ld.minusDays(1));
		
	}
	public static void main(String[] args) {
		DateDemo date = new DateDemo();
		date.acceptDate();
		date.isValid();
		date.getDayOfWeek();
		date.isLeapYear();
		date.getNextDay();
		date.getPreviousDay();
	}	
}
