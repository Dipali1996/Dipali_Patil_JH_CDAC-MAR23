import java.util.Scanner;

class RationalSeries{
	static float sum =0;
	
	static float rationalsum(float n){
		float num = (float) n;
		if(num==0)
			return sum;
	
		if((num%2) == 0){
			sum = sum - (1/num);
		}
		else
			sum = sum + (1/num);
		
		return rationalsum(num-1);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		float result = rationalsum(sc.nextFloat());
		System.out.printf("Sum of series is %.6f",result);

	}
	
}
