import java.util.*;
class SumOfLargestNoArray	//sum of 2 largest no of an arrays   
{
	public static void main(String[] args) 
	{
		int [] arr = {49,3,4,2,19,11,20,27};
		int sum=0;
		Arrays.sort(arr);
		sum = arr [arr.length-1]+arr[arr.length-2];
		System.out.println(sum);
	}
}