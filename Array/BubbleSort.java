import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args) 
	{
		int [] arr = {7,8,3,1,2};
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
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


class BubbleSort2
{
	public static void main(String[] args) 
	{
		int [] arr ={9,3,1,2,11,2,4};
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
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