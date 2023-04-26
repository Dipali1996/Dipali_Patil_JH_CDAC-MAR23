import java.util.Scanner;
import java.io.*;

class Permutaion{
	
	static void permutation(String curr, String rem){
		if(rem.length() == 0){
			System.out.println(curr);
		}
		
		for (int i =0;i<rem.length();i++){
			String r = rem.substring(0,i)+rem.substring(i+1);
			permutation(curr+rem.charAt(i), r);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to generate its permutations: ");
		String str = sc.next();
		permutation("",str);
	}
}