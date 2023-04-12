import java.util.Scanner;

public class RatoinalNumber {
	private int numerator;
	private int denominator;
	private double rationalnum [] =  new double[2];
	static Scanner sc = new Scanner(System.in);
	
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String acceptNumber() {
		System.out.println("Enter the first rational number:");
		System.out.println("Numerator : ");
		this.numerator = sc.nextInt();
		System.out.println("Denominator : ");
		this.denominator = sc.nextInt();
		this.rationalnum[0] =(double)this.numerator / (double)this.denominator;
		System.out.println("Enter the econd rational number:");
		System.out.println("Numerator : ");
		this.numerator = sc.nextInt();
		System.out.println("Denominator : ");
		this.denominator = sc.nextInt();
		this.rationalnum[1] = (double)this.numerator / (double)this.denominator;
		System.out.println("Enter the arithmetic operation (+, -, *, /): ");
		String ch = sc.next();
		return ch;
	}
	
	public void operation(String ch) {
		double result =0;
		switch(ch) {
		case "+":
			result = this.rationalnum[0] + this.rationalnum[1];
			break;
			
		case "-":
			if(this.rationalnum[0]>this.rationalnum[1])
				result = this.rationalnum[0] - this.rationalnum[1];
			else
				System.out.println("Second number must be smaller than first number to avoid negative value ans.");
			break;
			
		case "*":
			result = this.rationalnum[0] * this.rationalnum[1];
			break;
			
		case "/":
			result = this.rationalnum[0] / this.rationalnum[1];
			break;
		}
		System.out.println("Result: "+result);
	}
	 
}
