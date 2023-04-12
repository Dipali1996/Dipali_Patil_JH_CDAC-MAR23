package com.bank;

public class UserInfo {
	private String user_Name;
	private long aadhar_Card_Number;
	private long account_Number;
	
	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}

	public void setAccount_Balance(double account_Balance) {
		this.account_Balance = account_Balance;
	}

	public final void setAccount_Number() {
		this.account_Number = this.aadhar_Card_Number;
	}


	private double account_Balance;
	
	public UserInfo() {
		this.account_Balance = 0;
	}
	
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public long getAccount_Number() {
		return account_Number;
	}
	
	public long getAadhar_Card_Number() {
		return aadhar_Card_Number;
	}

	public void setAadhar_Card_Number(long string) {
		this.aadhar_Card_Number = string;
	}

	public double getAccount_Balance() {
		return account_Balance;
	}
	
}
