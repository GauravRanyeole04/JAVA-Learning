import java.util.*;
class ReverseArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5};
		int [] arr1 = new int [arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" ");
			// System.out.print(arr[i]+" ");
		}
	}
}