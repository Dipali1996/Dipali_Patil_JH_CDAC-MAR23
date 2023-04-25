import java.util.Scanner;
class Sum{
	int result=0, n = 0,num;;
	public void setNum(int num){
		this.num =num;
	}
	public int sum(){
		result = result+n;
		n++;
		if(n<num)
			sum();
		return result;			
	}
		

	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter last number of series : ");
		int num =sc.nextInt();
		
		Sum s = new Sum();
		s.setNum(num);
		int result = s.sum();
		System.out.println("Result : "+result);
		
	
	}
}