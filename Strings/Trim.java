import java.util.Scanner;
class UserTrim 
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();

		String str1 = userTrim();
		System.out.println(str+" : "+str.length());
		System.out.println(str1+" : "+str1.length());
	}

	public static String userTrim()
	{
		String nstr="";
		int indx = 0;
		for (int i=0;i<str.length();i++) 
		{
			if (str.charAt(i)!=' ') 
			{
				indx = i;
				break;
			}
		}
		nstr = str.substring(indx);
		for (int i=str.length()-1;i>=0;i--) 
		{
			if (str.charAt(i)!=' ') 
			{
				indx = i;
				break;
			}
		}
		nstr = nstr.substring(0,indx-1);
		System.out.println(nstr+"  : "+(nstr.length()));
		return nstr;
	}
}

class Trim
{
	public static void main(String[] args) 
	{
		String str = "   Gaurav   ";
		System.out.println(str.trim());
	}
}