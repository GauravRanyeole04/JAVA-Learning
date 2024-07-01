import java.util.Arrays;
class AssendingArrays  //bubble sort 
{
	public static void main(String[] args) 
	{
		int [] arr={5,3,2,1,6,4};
		System.out.println(Arrays.toString(arr));

		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr.length;j++) 
			{
				if (arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}