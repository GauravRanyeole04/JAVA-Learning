import java.util.Arrays;
class DecendingSelectionSort
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,8,7,6,5};

		for (int i=0;i<arr.length;i++) 
		{
			int max = i;
			for (int j=0+i;j<arr.length;j++)
			{
				if(arr[max]<arr[j])
				{
					max=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}