class SumOfArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		int sum=0;

		// for (int i=0;i<arr.length;i++) 
		// {
		// 	sum=sum+arr[i];
		// }
		int i=0;
		while(i<arr.length)
		{
			sum=sum+arr[i++];
		}
		System.out.println("Sum of Array : "+sum);
	}
}