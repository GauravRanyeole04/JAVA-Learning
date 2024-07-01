import java.util.*;
class DivideString
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str =sc.next().toLowerCase();	

		int divide = str.length()/2;

		String part1 = new String ();
		String part2 = new String ();
		String part3 = new String ();


		if(str.length()%2==0)
		{
			for (int i=0;i<divide;i++) 
			{
				char ch = str.charAt(i);
				part1 = part1+ch;
			}
			for (int i=divide;i<str.length();i++) 
			{
				char ch = str.charAt(i);
				part2 = part2+ch;
			}
			for (int i=str.length()-1;i>=divide;i--) 
			{
				char ch = str.charAt(i);
				part3 = part3+ch;
			}
		}
		else{
			System.out.println("Invalide length of String ");
		}
		System.out.println("part 1 : "+part1);
		System.out.println("part 2 : "+part2);
		System.out.println("part 3(reversed prt2) : "+part3);

	}
}