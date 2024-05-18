class HalfTriangle1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=3;j>=i-1;j--) 
			{
				System.out.print(" ");
			}

			for (int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
} 

class HalfTriangle
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=3;j>=i-1;j--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==5){
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}