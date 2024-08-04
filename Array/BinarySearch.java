import java.util.Arrays;
class BinarySearch 	
{
	public static void main(String[] args) 
	{
		int [] arr ={1,2,9,6,4,67,8,3,5,7,85,6};
		bubbleSort(arr);
		int target = 67;

		int indx = binarySearch(arr,target);
		if (indx == -1)
		{
			System.out.println("Element Not Found");
		}else{
			System.out.println("Element Found at : "+indx);
		}
	}

	public static int[] bubbleSort(int [] arr)
	{
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if (arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int binarySearch(int [] arr ,int  target)
	{
		int min=0;
		int max = arr.length-1;

		while(min<=max)
		{
			int mid = min+(max-min)/2;
			int midEle = arr[mid];

			if(midEle > target)
			{
				max = mid-1;
			}
			else if(midEle < target)
			{
				min = mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}