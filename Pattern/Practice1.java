class Y
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3;i++) 
		{
			for (int j=1;j<=5;j++) 
			{
				if (i==j||i==2&&j==4||i==1&&j==5||i==3&&j==3||i==4&&j==4)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

class S
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=6;j++) 
			{
				if (i==1||i==3||i==5||i+j==3||i+j==10) 
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}