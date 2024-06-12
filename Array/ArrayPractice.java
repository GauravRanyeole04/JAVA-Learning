import java.util.*;
class ArrayPractice
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6};  //singledimensional array
		char [] [] ch = {{'G','a','u','r','a','v'},{'s','u','n','n','y'}};  //multidimensional array

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(ch));
	}
}


class ArrayPrgm  //user define array
{
	int arr[];
	static Scanner sc = new Scanner(System.in);

	public void storeElement(int arr[])
	{
		this.arr=arr;
		for (int i=0;i<arr.length;i++) 
		{

			arr[i]=sc.nextInt();
		}
	}

	public void displayElement()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the Size : ");
		int size = sc.nextInt();

		System.out.print("Enter Array Elements : ");
		int arr[] = new int[size];

		ArrayPrgm obj = new ArrayPrgm();
		obj.storeElement(arr);
		obj.displayElement();
	}
}

class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,5,6};
		for(int i=1;i<arr.length;i++)
		{
			if(arr[0]<[1])
			{
				System.out.println(i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

