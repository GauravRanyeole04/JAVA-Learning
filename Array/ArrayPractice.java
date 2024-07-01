// import java.util.*;
// class ArrayPractice
// {
// 	public static void main(String[] args) 
// 	{
// 		int [] arr = {1,2,3,4,5,6};  //singledimensional array
// 		char [] [] ch = {{'G','a','u','r','a','v'},{'s','u','n','n','y'}};  //multidimensional array

// 		System.out.println(Arrays.toString(arr));
// 		System.out.println(Arrays.deepToString(ch));
// 	}
// }


// class ArrayPrgm  //user define array
// {
// 	int arr[];
// 	static Scanner sc = new Scanner(System.in);

// 	public void storeElement(int arr[])
// 	{
// 		this.arr=arr;
// 		for (int i=0;i<arr.length;i++) 
// 		{

// 			arr[i]=sc.nextInt();
// 		}
// 	}

// 	public void displayElement()
// 	{
// 		for(int i:arr)
// 		{
// 			System.out.println(i);
// 		}
// 	}
// 	public static void main(String[] args) 
// 	{
// 		System.out.print("Enter the Size : ");
// 		int size = sc.nextInt();

// 		System.out.print("Enter Array Elements : ");
// 		int arr[] = new int[size];

// 		ArrayPrgm obj = new ArrayPrgm();
// 		obj.storeElement(arr);
// 		obj.displayElement();
// 	}
// }

// // class SmallestNumber 
// // {
// // 	public static void main(String[] args) 
// // 	{
// // 		int []arr={1,2,3,4,5,6};
// // 		for(int i=1;i<arr.length;i++)
// // 		{
// // 			if()
// // 			{
// // 				System.out.println(i);
// // 			}
// // 		}
// // 		System.out.println(Arrays.toString(arr));
// // 	}
// // }


// import java.util.*;
// class SumProd1dArray 
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the Array Size : ");
// 		int size= sc.nextInt();
// 		System.out.println("Enter an Array Element : ");
// 		int arr[] = new int [size];
// 		int sum=0;
// 		int prod=1;
// 		for (int i=0;i<size;i++) 
// 		{
// 			arr[i]=sc.nextInt();
// 			sum=sum+arr[i];
// 			prod=prod*arr[i];
// 		}

// 		System.out.println("Sum : "+sum);
// 		System.out.println("Product : "+prod);		
// 	}
// }

// class EvenOddArray 
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the Size of an Array : ");
// 		int size= sc.nextInt();
// 		System.out.println("Enter an Array Element : ");
// 		int arr[] =new int[size];

// 		int evenCount=0;
// 		int oddCount=0;
// 		for(int i=0;i<size;i++)
// 		{
// 			arr[i]=sc.nextInt();
// 			if(arr[i]%2==0)
// 			{
// 				evenCount++;
// 			}
// 			else{
// 				oddCount++;
// 			}
// 		}
// 		int even[]=new int[evenCount];
// 		int odd[]=new int[oddCount];
// 		int itt1=0;
// 		int itt2=0;

// 		for(int i=0;i<size;i++)
// 		{
// 			if(arr[i]%2==0)
// 			{
// 				even[itt1++]=arr[i];
// 			}
// 			else{
// 				odd[itt2++]=arr[i];
// 			}
// 		}
		
// 		System.out.println("Even : "+(Arrays.toString(even)));
// 		System.out.println("Odd : "+(Arrays.toString(odd)));
// 	}
// }


// import java.util.*;
// class GretestNumber 
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=0;i<arr.length;i++) 
// 		{
// 			if(arr[i]%2==0)
// 			{
// 				System.out.println(arr[i]+": Even");
// 			}else{
// 				System.out.println(arr[i]+": Odd.");
// 			}
// 		}
// 	}
// }


class FabonaciiSunny  
{
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;

		StringBuffer sb = new StringBuffer();

		for (int i=0;i<=10;i++) 
		{
			sb.append(num1+"\n");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
		System.out.println(sb);

	}
}