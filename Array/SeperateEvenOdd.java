import java.util.*;

class SeperateEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter Array Element : ");
		int []arr=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		int evenCount=0;
		int oddCount=0;

		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2==0)
			{
				evenCount++;	//to find the new array size 
			}
			else{
				oddCount++;
			}
		}


		int evenArray[]=new int [evenCount];
		int oddArray[]=new int [oddCount];		//seperate Even & Odd Array(new) 

		int itt1=0;
		int itt2=0;  //for storing the original array element 
	
		for (int i=0;i<size;i++) 
		{
			if(arr[i]%2==0)
			{
				evenArray[itt1++]=arr[i];
			}
			else{
				oddArray[itt2++]=arr[i];
			}
		}
		System.out.println("Original Array : "+Arrays.toString(arr));
		System.out.println("Even Array : "+Arrays.toString(evenArray));
		System.out.println("Odd Array : "+Arrays.toString(oddArray));
	}
}