import java.util.Arrays;
class SwapingArray
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5,6};

		int temp=0;

		for(int i=0, j=arr.length-1;i<arr.length/2;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

//1.merged to one dimension arrays
//2.convert 2D array 1D Array 
//3.ZigZag Merging 
//4.print an array reversed in Array
//5.Reversed An Array
//6.merged 2 diff 2D arrays