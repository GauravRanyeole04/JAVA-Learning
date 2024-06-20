class StorePrimeNumberArray
{
	public static void main(String[] args) 
	{
		int count=0;
		boolean flag=false;
		int [] arr=new int[10];
		for (int i=2;i<=30;i++) 
		{
			 flag=true;
			for (int j=2;j<i;j++) 
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}	
			}
			arr[count]=i;
			count++;

			
		}

			if (flag)
			{
				System.out.println(arr[count]+"");
				
			}
		// System.out.println(arr[count]);
	}
}