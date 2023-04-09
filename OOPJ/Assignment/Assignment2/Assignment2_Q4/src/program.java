/*Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit

Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount
*/
public class program {
	public static void main(String[] args) {
		EBill E = new EBill("Dipali Shivaji Patil",300);
		E.calculateBillAmount();
	}
}
