class LBAssignment2Part1{
	public static void main(String main[]){
		System.out.println("Pattern1");
		//pattern1
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " " );
			}
			System.out.println();
		}
		
		
		System.out.println();System.out.println();System.out.println("pattern2");

		//pattern2
		
		
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j + " " );
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern3");
		//pattern3
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern4");

		//pattern4
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern5");
		//pattern5
		
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern6");
		
		//pattern6
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)	
			{	
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{				
				System.out.print(" *");	
			}
			
			System.out.println();	
			
		}
	
		System.out.println();System.out.println();System.out.println("pattern7");
		//pattern7
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
				
		System.out.println();System.out.println();System.out.println("pattern8");
		
		//pattern8
		
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(" "+k);
			}

			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern9");

		//pattern9
		for(int i=65;i<=69;i++)
		{
			for(int j=69;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=i;k++)
			{
				System.out.print(" "+(char)k);
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 10");

		//pattern10
		
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<=(int)i-1;j++)
			{
				System.out.print(" ");
			}
			for(char k=i;k<='E';k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 11");
		
		//pattern11
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 12");

		//pattern 12
		
	
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 13");

		//pattern 13
		 
		for(int i=65;i<=69;i++)
		{
			for(int j=i+1;j<=69;j++)
			{
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 14");
		
		//pattern14
		

		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 15");

		//pattern 15
		
		for(int i=1;i<=5;i++)
		{
			
			for(int k=5;k>=i;k--)
			{				
				System.out.print(k+" ");	
			}
			
			System.out.println();	
			
		}
		
		System.out.println();System.out.println();System.out.println("pattern 16");

		//pattern 16
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		System.out.println();System.out.println();System.out.println("pattern 17");

		//pattern17
		
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern 18");

		//pattern18
		
		for(int i=69;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j +" ");
			}
			System.out.println();
		}
		
		
	}
}