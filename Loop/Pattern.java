class Square 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ ) 
		{
			for (int j=1;j<=5 ;j++ ) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class Triangle 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++ ) 
		{
			for (int j=1;j<=i;j++ ) 
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}

class Triangle1
{
	public static void main(String[] args) {
		for (int i=5;i>=1;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}

class Square1
{
	public static void main(String[] args) {
		for (int i=1;i<=5 ;i++ ) 
		{
			for(int j=1;j<=5;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class Triangle2
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++) 
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class Triangle3
{
	public static void main(String[] args) 
	{
		int n=5;
		int rows=5;

		for (int i=1;i<=rows;i++ ) 
		{
			for (int j=1;j<=rows-i;j++ ) 
			{
				System.out.print("  ");
			}
				for (int k=1;k<=i ;k++ ) 
				{
					System.out.print("* ");
				}
				System.out.println();	
		}
	}
}
