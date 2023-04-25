import java.util.Scanner;
class Fabonical{
	static int n1=0,n2=1,n3;
	public static void  fabonical( int num) {
		if(num > 0)
		{
			n3 =n1+n2;
			n1=n2;
			n2= n3;
			
			System.out.println(n3);
			fabonical(num-1);
				
		}
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of series : ");
		int num =sc.nextInt();
		
		fabonical(num-2);
		
	}
}