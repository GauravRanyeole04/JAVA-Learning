import java.util.*;
class CharAscii
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str= sc.next();
		int sum=0;
		for (int i=0;i<str.length();i++) 
		{
			char str2=str.charAt(i);
			int ascii=str2;   //widening 
			System.out.println(str2+" : "+ascii);
			sum=sum+ascii;
		}
		System.out.println("sum of your name : "+sum);
	}
}