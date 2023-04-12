package com.toll.booth.bill;

import java.util.Scanner;

public class VehicleInfo {
	String vehicleType;
	int numAxles;
	double distanceTraveled;
	private double tollFee;
	private double totalAmountDue;
	
	static Scanner sc = new Scanner(System.in);
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumAxles() {
		return numAxles;
	}
	public void setNumAxles(int numAxles) {
		this.numAxles = numAxles;
	}
	public double getDistanceTraveled() {
		return distanceTraveled;
	}
	public void setDistanceTraveled(double distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	
	public enum VehicalType{
		CAR,VAN,BUS,TRUCK
	}
	
	public void calculateTollFee(VehicalType choice) {
		
		if((VehicalType.CAR == choice)||(VehicalType.VAN == choice) || (VehicalType.BUS == choice) )
		{
			tollFee = 0.25;
		}
		else if(VehicalType.TRUCK == choice) {
			tollFee = 0.25;
		}
		
		totalAmountDue =(tollFee*numAxles*distanceTraveled)+2;		
	}
	
	public void generateBill(){
		System.out.println(this.vehicleType + " "+ this.numAxles+" "+this.distanceTraveled+" "+this.tollFee+ " " +this.totalAmountDue);
	}
	
	public int showMenu(){
		System.out.println("0. Exit");
		System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
		System.out.println("2. Enter number of axles ");
		System.out.println("3. Enter distance travelled ");
		System.out.println("4. Calculate toll fee ");
		System.out.println("5. Generate bill ");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public VehicalType menuVehical() {
		System.out.println("0. CAR ");
		System.out.println("1. VAN ");
		System.out.println("2. BUS ");
		System.out.println("3. TRUCK ");
		System.out.println(" Enter choice ");
		int choice = sc.nextInt();
		return VehicalType.values()[choice];
	}
	
	
}
