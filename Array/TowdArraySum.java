import java.util.Scanner ;
class TowdArraySum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num of Rows : ");
		int row= sc.nextInt();
		System.out.print("Enter num of Column : ");
		int cols= sc.nextInt();

		int sum=0;
		int prod=1;

		System.out.print("Enter the element of Array : ");
		int [][] arr = new int [row][cols];

		for(int i=0;i<row;i++)
		{
			for (int j=0;j<cols;j++) 
			{
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
				prod=prod*arr[i][j];
			}
		}

		for(int i=0;i<row;i++)
		{
			for (int j=0;j<cols;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);

	}
}

