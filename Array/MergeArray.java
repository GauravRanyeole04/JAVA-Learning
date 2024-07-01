import java.util.*;
class MergeArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1 Array Size : ");
		int size1= sc.nextInt();
		System.out.println("Enter the 1 Array Element : "); 
		int []arr1=new int[size1];

		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.print("Enter 2 Array Size : ");
		int size2= sc.nextInt();
		System.out.println("Enter the 2 Array Element : "); 
		int []arr2=new int[size2];

		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}

		int mergeArraySize=size1+size2;
		int [] mergeArray=new int [mergeArraySize];

		for (int i=0;i<size1;i++) 
		{
			mergeArray[i]=arr1[i];
		}

		for (int i=0;i<size2;i++) 
		{
			mergeArray[size1+i]=arr2[i];
		}
		
		System.out.println("First Array : "+Arrays.toString(arr1));
		System.out.println("Second Array : "+Arrays.toString(arr2));
		System.out.println("Merged Array : "+Arrays.toString(mergeArray));
	}
}