import java.util.Scanner;
class StartsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str =sc.nextLine();

		System.out.print("Enter String to check : ");
		String str1 = sc.next();

		boolean op = userStartsWith(str1);
		System.out.print(str+" : "+op);
	}

	public static boolean userStartsWith(String str1)
	{
		boolean flag = true;
		for (int i=0;i<str1.length();i++) 
		{
			char ch = str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}



class StartsWithDoubleArgument
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str =sc.nextLine();

		System.out.print("Enter String to check : ");
		String str1 = sc.next();

		System.out.print("Enter a index : ");
		int startIndx = sc.nextInt();

		boolean op = userStartsWith(str1,startIndx);
		System.out.print(str+" : "+op);
	}

	public static boolean userStartsWith(String str1,int startIndx)
	{
		if(startIndx<0 || startIndx>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong Input : "+startIndx);
		}
		boolean flag = true;
		for (int i=startIndx;i<str1.length();i++) 
		{
			char ch = str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag = 	false;
				break;
			}
		}
		return flag;
	}
}