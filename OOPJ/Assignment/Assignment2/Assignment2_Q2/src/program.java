/*
 * You have been asked to write a Java program to implement a BMI (Body Mass 
Index) calculator. The program should have the following functionality:
The BMI calculator class should have the following fields:
a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.
The BMI calculator class should have the following methods:
a. A constructor to initialize the height and weight fields of the BMI calculator 
object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the 
following formula: 
BMI = weight / (height * height).
Write a Java program that creates an object of the BMI calculator class, prompts the 
user to input their height and weight, sets the height and weight fields of the BMI 
calculator object using the setter methods, calculates the BMI using the 
calculateBMI() method, and prints the calculated BMI to the console
 */
import java.util.Scanner;

public class program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			
		BMI B = new BMI();
		System.out.println("Enter Height in meter :");
		B.setHeight(sc.nextDouble());
		System.out.println("Enter Weight in meter :");
		B.setWeight(sc.nextDouble());
		
		B.calculateBMI();
		
	}
}
