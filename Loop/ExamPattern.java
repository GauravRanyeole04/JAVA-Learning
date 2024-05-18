class ExamPattern
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++ ) 
		{
			for (int j=4;j>=i;j-- ) 
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++ ) 
			{
				int sum=i+k;
				if (sum%2==0) {
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}