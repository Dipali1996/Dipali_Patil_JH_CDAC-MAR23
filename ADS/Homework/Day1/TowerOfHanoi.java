import java.util.Scanner;

class TowerOfHanoi{

	static void toh(int n, char src, char helper , char dest){
		if(n==1)
			System.out.println("Disk1 from "+src +" to "+dest);
		
		else{
			toh(n-1,src,dest,helper);
			System.out.println("Disk2 from "+src +" to "+dest);
			toh(n-1,helper,src,dest);
		}
	
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n =sc.nextInt();
		char[] ch = {'A','B','C'};
		toh(n,ch[0],ch[1],ch[2]);
	}
}