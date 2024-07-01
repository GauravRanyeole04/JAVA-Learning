// import java.util.Scanner;
// class StoreFibonacciNumber
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter num to find series : ");
// 		int num=sc.nextInt();
// 		int num1=0;
// 		int num2=1;

// 		StringBuffer sb = new StringBuffer();

// 		for (int i=0;i<num;i++) 
// 		{
// 			sb.append(num1+"\n");
// 			int num3=num1+num2;
// 			num1=num2;
// 			num2=num3;
// 		}
// 		System.out.println(sb);
// 	}
// }	

class FabonaciiSeriesNumber 
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