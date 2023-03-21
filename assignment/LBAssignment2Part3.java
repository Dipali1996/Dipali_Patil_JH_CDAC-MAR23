class LBAssignment2Part3{

	public static void main(String args[])
	{
		System.out.println("Pyramid pattern-1");
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();			
		}
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-2");
		
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-3");

		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{ 
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-4");
		
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-5");

		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=9;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=8;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-6");

		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=9;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Pyramid pattern-7");

		for(int i=9;i>=1;i--)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Half Pyramid");

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Inverted Half Pyramid");

		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();System.out.println("Hollow Inverted Half Pyramid");

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				
				if(j==1||i==1||(i+j==7))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();System.out.println();System.out.println();System.out.println("Full Pyramid");

		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
					System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();System.out.println();System.out.println();System.out.println("Inverted Full Pyramid");

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print(" ");
			}
			for(int j=6;j>=i;j--)
			{
					System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println();System.out.println();System.out.println();System.out.println("Hollow Full Pyramid");

		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=6;j++)
			{
				if(j==1||i==6||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		}
}