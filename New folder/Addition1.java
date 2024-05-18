import java.util.Scanner;

class Addition
{
	public static void main(String [] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number : "); 
		int num=sc.nextInt();
		// int dup=num;
		int sum=0;
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		num=num/10;
		sum=sum+num%10;
		System.out.print(sum);
	}
}