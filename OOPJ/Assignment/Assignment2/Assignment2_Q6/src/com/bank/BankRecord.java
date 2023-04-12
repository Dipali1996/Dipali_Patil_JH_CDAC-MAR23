package com.bank;

import java.util.Scanner;

public class BankRecord {
	int index = 0;
	UserInfo [] arr;
	
	public BankRecord() {
		
		this(10);
	}
	
	public BankRecord(int size) {
		super();
		this.arr = new UserInfo [size];
	}

	public void acceptInfo(UserInfo arr1) {
		if(index < this.arr.length) {
			this.arr[index ] = arr1;
			System.out.println(this.arr[index ].getUser_Name() +" "+this.arr[index ].getAccount_Number());
			index = index +1;
		}
	}
	static Scanner sc = new Scanner(System.in);
	
	public void printAccountInfo(long account_Number) {
		int x=1;
		for( int index = 0; index < arr.length; ++ index ) {
			if(this.arr[ index ] != null && this.arr[index].getAccount_Number()==  account_Number) {
				System.out.println(arr[index].getUser_Name()+"  "+arr[index].getAccount_Balance());
				x =0;
			}
		}
		if (x==1)	{
			System.out.println("Sorry, Record not exist.\nPlease enter valid Acoount Number.");
			x =0;
		}
		
	}
	
	public void depositeMoney (long accountNumber) {
		int x=1;
		for( int index = 0; index < arr.length; ++ index ) {
			if(this.arr[index] != null && this.arr[index].getAccount_Number()==accountNumber) {
				System.out.println("Enter amount you want to Diposite to your account");
				double amount =sc.nextDouble();
				x=0;
				this.arr[index].setAccount_Balance((this.arr[index].getAccount_Balance()+amount));
			}
		}
		
		if (x==1)	{
			System.out.println("Sorry, Record not exist.\nPlease enter valid Acoount Number.");
			x =0;
		}
	}
	
	public void withdrawMoney(long accountNumber) {		
		int x=1;
			for( int index = 0; index < arr.length; ++ index ) {
				if(this.arr[index] != null && this.arr[index].getAccount_Number()==accountNumber) {
					System.out.println("Enter amount you want to withdraw from your account");
						double amount =sc.nextDouble();
						x=0;
						if(this.arr[index].getAccount_Balance()>=amount) 
							this.arr[index].setAccount_Balance((this.arr[index].getAccount_Balance()-amount));
						else
							System.out.println("Sorry,you have not sufficient balance");	
				}
			}
			
		if (x==1)	{
			System.out.println("Sorry, Record not exist.\nPlease enter valid Acoount Number.");
			x =0;
			}
		}
	
	
	public void dispalyBalance(long accountNumber) {
		int x=1;
			for( int index = 0; index < arr.length; ++ index ) {
				if(this.arr[index] != null && this.arr[index].getAccount_Number()==accountNumber) {
				System.out.println("Your account balance is "+this.arr[index].getAccount_Balance());
				x =0;
				}
			}
		if(x==1){
			System.out.println("Sorry, Record not exist.\n Please enter valid Acoount Number.");
		}	
	}
	
}
