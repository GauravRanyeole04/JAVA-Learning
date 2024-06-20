import java.util.*;
class SumofOddIndexArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array Size : ");
		int size = sc.nextInt();
		System.out.println("Enter an Element : ");
		int [] arr=new int [size];


		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		int sum=0;

		for (int i=1;i<arr.length;i++) 
		{
			sum=sum+arr[i++];
		}
		System.out.println("Array's Odd index Sum : "+sum);
	}
}