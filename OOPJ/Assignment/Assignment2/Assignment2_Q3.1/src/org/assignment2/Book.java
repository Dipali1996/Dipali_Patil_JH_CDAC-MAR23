package org.assignment2;

import java.util.Scanner;

public class Book {
	String Title;
	String Author;
	String Publisher;
	String ISBN_Number;
	int Year;
	double Price;
	int Quantity;
	
	public Book() {
		this.Title  = null;
		this.Author = null;
		this.Publisher = null;
		this.ISBN_Number = null;
		this.Year = 0;
		this.Price = 0;
		this.Quantity = 0;
	}
	
	public void setTitle(String title) {
		this.Title = title;
	}
	
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	
	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}
	
	public void setYear(int Year) {
		this.Year = Year;
	}
	
	public void setISBN_Number(String ISBN_Number) {
		this.ISBN_Number = ISBN_Number;
	}
	
	public void setPrice(double Price) {
		this.Price = Price;
	}
	
	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}
	
	public String getTitle() {
		return this.Title;
	}
	
	public String getAuthor() {
		return this.Author;
	}
	public String getPublisher() {
		return this.Publisher;
	}
	
	public String getISBN_Number() {
		return this.ISBN_Number;
	}
	
	public int getYear() {
		return this.Year;
	}
	
	public int getQuantity() {
		return this.Quantity;
	}
	
	public double getPrice() {
		return this.Price;
	}
	
	public void increaseQuantity(int quantity){
		this.Quantity = this.Quantity + quantity;
		System.out.println("Book Quantity increase by "+ quantity +" and new quantity of book available in Inventiry is "+this.Quantity);
	}
	
	public void decreaseQuantity(int quantity){
		this.Quantity = this.Quantity - quantity;
		System.out.println("Book Quantity decrease by "+ quantity +" and new quantity of book available Inventiry is "+this.Quantity);
	}
	
	public void getInventoryValue() {
		double Total = this.Price * this.Quantity ;
		System.out.println(" Total value of Inventory  is "+Total);
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord(){
		System.out.println("Enter Title of book : ");
		setTitle(sc.nextLine());
		System.out.println("Enter Author of book : ");
		setAuthor(sc.nextLine());
		System.out.println("Enter Publisher of book : ");
		setPublisher(sc.nextLine());
		System.out.println("Enter ISBN_Number of book : ");
		setISBN_Number(sc.nextLine());
		System.out.println("Enter Publication Year of book : ");
		setYear(sc.nextInt());
		System.out.println("Enter Price of book : ");
		setPrice(sc.nextDouble());
		System.out.println("Enter Quantity of book : ");
		setQuantity(sc.nextInt());	
	}
	
	
}
