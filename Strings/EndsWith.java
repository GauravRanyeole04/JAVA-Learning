import java.util.Scanner;
class EndsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str =sc.nextLine();

		System.out.print("Enter String to check : ");
		String str1 = sc.next();

		boolean op = userEndsWith(str1);
		System.out.print(str+" : "+op);
	}

	public static boolean userEndsWith(String str1)
	{
		boolean flag = true;
		for (int i=str1.length()-1,j=str.length()-1;i>=0;i--,j--) 
		{
			char ch = str1.charAt(i);
			if(ch!=str.charAt(j))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}