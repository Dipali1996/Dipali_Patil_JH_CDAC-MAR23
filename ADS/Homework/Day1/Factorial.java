import java.util.Scanner;
class Factorial{
	public static long factorial( int num) {
		if(num>1){
			return num*factorial(num-1);
		}
		return 1;
	
	}
		

	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of series : ");
		int num =sc.nextInt();
		
		System.out.println("Factorial number : "+factorial(num));
		
	}
}