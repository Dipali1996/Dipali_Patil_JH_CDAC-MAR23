/*
You are required to write a Java program to implement a Book class that can be 
used to manage a book inventory system. 
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructors, 
b. Getter & setter methods
c. Business Logic methods
I. increaseQuantity(int quantity ): A method to increase the quantity of 
the book in the inventory by the specified amount.
II. decreaseQuantity(int quantity): A method to decrease the quantity of 
the book in the inventory by the specified amount.
III. getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book
*/
package org.assignment2;

import java.util.Scanner;
class Test{
	static Scanner sc = new Scanner(System.in); 
	static void BookInventory() {
		Book B =new Book();
		int choice =1;
		while(choice != 0) {
			System.out.println("Enter Choice :");
			System.out.println("0 Exist :");
			System.out.println("1 Add Book :");
			System.out.println("2 Increase Quantity of Book :");
			System.out.println("3 Decrease Quantity of Book :");
			System.out.println("4 To know value of Inventory :");

			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					B.acceptRecord();
					break;
			
				case 2 :
					System.out.println("Enter Quantity of book you want to increase : ");
					B.increaseQuantity(sc.nextInt());
					break;
					
				case 3:
					System.out.println("Enter Quantity of book you want to increase : ");
					B.decreaseQuantity(sc.nextInt());
					break;
					
				case 4:
					B.getInventoryValue();
					break;
					
				}
				if(choice == 0) {
					System.out.println("Thank you for visiting.");
				}
				else
					System.out.println("Thank you for visiting .Do you want choice another option except 0 ");
			 }
		}
	}


public class Inventory {
	
	
	
	public static void main(String[] args) {
		Test.BookInventory();
	}
}
