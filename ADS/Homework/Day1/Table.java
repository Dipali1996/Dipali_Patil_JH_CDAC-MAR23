import java.util.Scanner;
class Table{
	
	
	static void table( int n,int num){
		
		if(n==10)	
			return;
		
		System.out.println(num + " * " + n +"="+(num * n));
		table(n+1,num);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		table(1,sc.nextInt());
	}
}