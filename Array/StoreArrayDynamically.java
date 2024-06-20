import java.util .*;
class StoreArrayDynamically
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array Size : ");
		int size = sc.nextInt();
		System.out.print("Enter an Array Element : ");
		int []arr = new int[size];

		for (int i=0;i<arr.length;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}