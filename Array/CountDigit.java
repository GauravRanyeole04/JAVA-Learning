import java.util.*;
class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array Size : ");
		int size=sc.nextInt();

		System.out.println("Enter array Element : ");
		int arr[]=new int [size];

		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Number to get the Count of its : ");
		int cNum=sc.nextInt();

		int count =0;

		for (int i=0;i<size;i++) 
		{
			if(arr[i]==cNum)
			{
				count++;
			}
		}

		System.out.println("Count of "+cNum+" is : "+count);
	}
}