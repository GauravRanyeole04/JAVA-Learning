import java.util.*;
class OneDArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		System.out.println("Enter an Element : ");
		int [] arr=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}


		//for loop
		// for (int i=0;i<arr.length;i++) 
		// {
		// 	System.out.print(arr[i]+" ");
		// }
		// System.out.println(Arrays.toString(arr));
		// System.out.println();

		// // //while loop
		int i=0;
		while(i<arr.length)
		{
			System.out.print(arr[i]+" ");
			i++;
		// }
		System.out.println();

		//Do While Loop 
		// do{
		// 	System.out.println(arr[i]+" ");
		// 	i++;
		// }while(i<arr.length);
		// System.out.println();

		//for each
		// for (int i : arr) 
		// {
		// 	System.out.print(i+" ");
		// }
	}
}