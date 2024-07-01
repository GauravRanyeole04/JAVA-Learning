//wajp to sort an element in asc ord 
import java.util.*;
class SortAscArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();

		System.out.println("Enter an Array Element : ");
		int arr[]= new int[size];

		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}

		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])     //for decending if (arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Second Smallest Array");
		System.out.println(Arrays.toString(arr));
	}
}