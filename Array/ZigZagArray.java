import java.util.Scanner ;
import java.util.Arrays;
class ZigZagArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Array Size : ");
		int size1= sc.nextInt();
		System.out.println("Enter 1st Array Element : ");
		int arr1[]=new int[size1];
		for (int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Size : ");
		int size2= sc.nextInt();
		System.out.println("Enter 2nd Array Element : ");
		int arr2[]=new int[size2];
		for (int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}

		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		int max=(((arr1.length)>(arr2.length))?arr1.length:arr2.length);
		int zigZagSize = size1+size2;
		int [] zigZagArr=new int [zigZagSize];
		int indx=0;
		for (int i=0;i<max;i++) 
		{
			if(i<size2)
				zigZagArr[indx++]=arr2[i];
			zigZagArr[indx++]=arr1[i];
		}
		System.out.println(Arrays.toString(zigZagArr));
	}
}