class LBAssignment2Part2{

	public static void main(String args[])
	{
		System.out.println("pattern1");
		//pattern1
		
		/*
			*
			**
			***
			****
			*****
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern2");
		//pattern2
		
		/*
				 *
				**
			   ***
			  ****
			 *****
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern3");
		//pattern3
		/*
				*****
				****
				***
				**
				*
				
		*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern4");
		//pattern4
		
		/*
			*****
			 ****
			  ***
			   **
				*
		*/
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern5");
		
		//pattern5
		
		/*
				    *
				   ***
				  *****
				 *******
				*********
		
		*/
		
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
		
		System.out.println();System.out.println();System.out.println("pattern6");
		//pattern6
		/*
			*********
			 *******
			  *****
			   ***
				*
		*/
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern7");
	
	
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
		
	
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for (int j=1;j<=i-1;j++)
			{
				System.out.print("*");
			}
			
			for(int j=2;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern8");
	
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern9");

		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println();System.out.println();System.out.println("pattern10");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();System.out.println();System.out.println("pattern11");

		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();System.out.println();System.out.println("pattern12");
		
		for(int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern13");

		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern14");
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println("pattern15");

		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
				
		System.out.println();System.out.println();System.out.println("pattern16");

		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}
	}
	
}