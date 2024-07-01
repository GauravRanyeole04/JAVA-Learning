import java.util.Arrays;
import java.util.Scanner;

class ConvertStringAsscending 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name = sc.next();

		int [] arr = new int[name.length()];

		int itt=0;
		for (int i=0;i<name.length();i++) 
		{
			arr[itt++]=name.codePointAt(i);
		}


		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr.length;j++) 
			{
				if (arr[i]<arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		
		for (int i=0;i<arr.length;i++) 
		{
			char uName=(char)arr[i];
			System.out.print(uName);
		}
	}
}