import java.util.Scanner;
class UserToLowerCaseMethod 
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		str=sc.nextLine();
		String op=userToLowerCaseMethod();
		System.out.println(str+" : "+op);
	}

	public static String userToLowerCaseMethod()
	{
		String nstr="";
		for (int i=0;i<str.length();i++) 
		{
			char ch =str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				nstr=nstr+ (char)(ch+32);
			}
			else{
				nstr = nstr+ch;
			}
		}
		return nstr;
	}
}


class ToLowerCaseMethod 
{
	public static void main(String[] args) 
	{
		String name="gaurav rohidas ranyeole";
		System.out.println(name.toLowerCase());

	}
}