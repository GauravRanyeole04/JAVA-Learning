class Triangle4
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=i-1;j++) 
			{
				System.out.print("  ");
			}
			for (int j=5;j>=i;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class HallowTriangle4
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=i-1;j++) 
			{
				System.out.print("  ");
			}
			for (int j=5;j>=i;j--) 
			{
				if(i==1||j==5||i==j){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}