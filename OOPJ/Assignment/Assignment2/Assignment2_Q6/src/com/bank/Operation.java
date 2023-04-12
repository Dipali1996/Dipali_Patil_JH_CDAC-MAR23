package com.bank;

import java.util.Scanner;

import com.bank.BankRecord;
public class Operation {
	static Scanner sc = new Scanner(System.in);
	public static void newAccount(UserInfo user) {
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		user.setUser_Name(sc.nextLine());
		System.out.println("Enter Aadharcard no. : ");
		user.setAadhar_Card_Number(sc.nextLong());
		user.setAccount_Balance(0);
		user.setAccount_Number();
		
		
	}
	public static int menulist() {
		System.out.println("Enter your choice : ");
		System.out.println("0.Exit");
		System.out.println("1.Add New Account");
		System.out.println("2.Deposite Amount");
		System.out.println("3.Withdraw Amount");
		System.out.println("4.Dispaly Account Balance");
		System.out.println("5.Dispaly account Information");
		return sc.nextInt();
	}
	public static void operation() {
		BankRecord bank = new BankRecord();
		int ch1;
		while( ( ch1 = Operation.menulist()) >0 ){
			
			switch(ch1) {
				case 1 :
					UserInfo user = new UserInfo();
					Operation.newAccount(user);
					bank.acceptInfo(user);
					break;
				case 2:
					System.out.println("Enter Account no. : ");
					long ac = sc.nextLong();
					bank.depositeMoney(ac);
					break;
				case 3:
					sc.nextLine();
					System.out.println("Enter Account no. : ");
					long ac1 = sc.nextLong();
					bank.withdrawMoney(ac1);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Enter Account no. : ");
					long ac2 = sc.nextLong();
					bank.dispalyBalance(ac2);
					break;
				case 5:
					System.out.println("Enter Account no. : ");
					long ac3 = sc.nextLong();
					bank.printAccountInfo(ac3);
					break;
			}
		}
	}
}
