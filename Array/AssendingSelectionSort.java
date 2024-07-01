import java.util.Arrays;
class AssendingSelectionSort
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,8,7,6,5};

		for (int i=0;i<arr.length;i++) 
		{
			int min = i;
			for (int j=0+i;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}