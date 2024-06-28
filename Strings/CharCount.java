import java.util.*;
class CharCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String name = sc .next().toLowerCase();
		System.out.println("Enter the char to get count : ");
		char ch= sc.next().charAt(0);

		int count=0;

		for (int i=0;i<name.length();i++) 
		{
			char ch2=name.charAt(i);
			if(ch==ch2)
			{
				count ++;
			}
		}
		System.out.println(ch+" is present "+count +" times.");
	}
}