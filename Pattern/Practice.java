// class Practice 
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for(int j=5;j>=i;j--)
// 			{
// 				System.out.print("  ");
// 			}

// 			for (int j=1;j<=i-1;j++) 
// 			{
// 				System.out.print("* ");
// 			}
			
// 			System.out.println();
// 		}
// 	}
// }


class PrimePattern 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ ) 
		{
			int num=1;
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(num+" ");
				num++;
			}

			// for (int j=5;j>=i;j--) 
			// {
			// 	System.out.print(" ");
			// }
			System.out.println();			
		}
	}
}

