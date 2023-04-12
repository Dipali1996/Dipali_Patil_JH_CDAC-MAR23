/*Toll Booth Bill Generator
You are required to write a Java program to implement a Toll Booth Bill Generator. 
The program should be able to calculate the toll fee for each vehicle based on the 
number of axles and the distance travelled. The program should also be able to 
generate a bill for each vehicle.
Each vehicle should have the following information:
a. Vehicle type (String)
b. Number of axles (int)
c. Distance Information
Each toll booth should have the following information:
a. Distance travelled (double)
b. Toll Fee Calculation
The program should be able to calculate the toll fee for each vehicle based on the 
following criteria:
a. Cars, vans, and buses pay a base rate of $0.25 per mile for each axle.
b. Trucks pay a base rate of $0.50 per mile for each axle.
The program should be able to generate a bill for each vehicle based on the following 
criteria:
a. The bill should include the vehicle type, number of axles, distance travelled, 
toll fee, and total amount due.
b. The total amount due should include a $2.00 processing fee.
c. The toll fee calculation and total amount due should not be accessible outside 
of the class.
The program should have the following methods:
a. calculateTollFee(): A method to calculate the toll fee for a given vehicle based 
on the number of axles and distance travelled.
b. generateBill(): A method to generate a bill for a given vehicle based on the toll 
fee and total amount due.
c. showMenu(): A method to show the menu options for the user to input the 
vehicle information.
The program should have the following fields:
a. vehicleType: A string field to store the type of vehicle.
b. numAxles: An integer field to store the number of axles.
c. distanceTraveled: A double field to store the distance traveled.
d. tollFee: A double field to store the calculated toll fee.
e. totalAmountDue: A double field to store the total amount due.
The program should show the following menu options:
a. Enter vehicle type (car, van, bus, or truck)
b. Enter number of axles
c. Enter distance travelled
d. Calculate toll fee
e. Generate bill
f. Exit

 * */

package com.toll.booth.bill;
import java.util.Scanner;

import com.toll.booth.bill.VehicleInfo;
class program{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		VehicleInfo vehicle = new VehicleInfo();
		
		int choice;
		while((choice = vehicle.showMenu()) != 0) {
			switch(choice) {
				case 1:
					System.out.println("Enter vehicle type (car, van, bus, or truck) ");
					vehicle.setVehicleType(sc.next());
					break;
				case 2:
					vehicle.setNumAxles(sc.nextInt());
					break;
				case 3:
					vehicle.setDistanceTraveled(sc.nextDouble());
					break;
				case 4:
					vehicle.calculateTollFee(vehicle.menuVehical());
					break;
				case 5: 
					vehicle.generateBill();
					break;
	
			}
		}
	}
}
