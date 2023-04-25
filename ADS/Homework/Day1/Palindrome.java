import java.util.Scanner;
class Palindrome{
	
	
	public static int palindrome(int num,int temp){
		if(num == 0){
			return temp;
		}
		
		temp = (temp * 10)+(num %10);
		
		return palindrome(num/10,temp);
		
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int result = palindrome(n,0);
		if(n == result)
			System.out.println(n+ " is plaindrome number.");
		else
			System.out.println(n+ " is not plaindrome number.");
	
	}
}