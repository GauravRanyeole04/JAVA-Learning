class Triangle
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ ) 
		{
			char ch='a';
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}

class Triangle2
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}

class Triangle3
{
	public static void main(String[] args) 
	{
	int num=1;
		for (int i=1;i<=5;i++ ) 
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		}
	}
}

class Triangle4
{
	public static void main(String[] args) 
	{
	int num=1;
		for (int i=1;i<=5;i++ ) 
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=2;
			}
			System.out.println();
		}
	}
}

class Triangle5
{
	public static void main(String[] args) 
	{
		char ch='a';
		for (int i=1;i<=5;i++ ) 
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch+=1;
			}
			System.out.println();
		}
	}
}		

class Triangle6     //Assignment 
{
	public static void main(String[] args) 
	{
		int num=0;
		for (int i=1;i<=5;i++ ) 
		{
			num+=i;
			for (int j=1; j<=i; j++) 
			{
				System.out.print(num-- +" ");
			}
			num+=i;
			System.out.println();
		}
	}
}

class Triangle7
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=5;j>=i ;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}