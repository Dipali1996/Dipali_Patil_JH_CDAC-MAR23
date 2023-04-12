/*Credit Score Calculator Practice Question
You have been asked to write a Java program to implement a credit score calculator. 
The credit score calculator class should have the following fields:
a. creditHistory: An int to represent the length of the individual's credit history.
b. creditUtilization: A double to represent the percentage of available credit the 
individual is using.
c. paymentHistory: A boolean to represent whether the individual has a good 
payment history or not.
The credit score calculator class should have the following methods:
a. Constructors
b. Getter and setter methods
c. int calculateCreditScore(): A method to calculate the credit score based on 
the provided information. The credit score should be calculated using the 
following formula:
I. If the individual has a good payment history, the credit score should 
be calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55
II. If the individual has a bad payment history, the credit score should be 
calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35 */

import java.util.Scanner;

public class program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		CreditScoreCalculator cs = new CreditScoreCalculator(100, 20, true);
		System.out.println("Enter credit history ");
		cs.setCreditHistory(sc.nextInt());
		System.out.println("Enter credit utilization ");
		cs.setCreditUtilization(sc.nextDouble());
		System.out.println("Enter credit payment history (true or false)");
		cs.setPaymentHistory(sc.nextBoolean());
		cs.calculateCreditScore();	
	}
	
}
